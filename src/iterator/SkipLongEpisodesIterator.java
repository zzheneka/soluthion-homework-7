package iterator;

import iterator.Episode;
import iterator.EpisodeIterator;

import java.util.List;

public class SkipLongEpisodesIterator implements EpisodeIterator {
    private final List<Episode> episodes;
    private int index = 0;

    public SkipLongEpisodesIterator(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public boolean hasNext() {
        while (index < episodes.size() && episodes.get(index).getRuntimeSec() > 1800) {
            index++; // пропуск длинных серий
        }
        return index < episodes.size();
    }

    @Override
    public Episode next() {
        return episodes.get(index++);
    }
}
