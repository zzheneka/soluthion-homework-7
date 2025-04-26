package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleSeasonIterator implements EpisodeIterator {
    private final List<Episode> shuffledEpisodes;
    private int index = 0;

    public ShuffleSeasonIterator(List<Episode> episodes) {
        this.shuffledEpisodes = new ArrayList<>(episodes);
        Collections.shuffle(shuffledEpisodes, new Random(42)); // фиксированный seed
    }

    @Override
    public boolean hasNext() {
        return index < shuffledEpisodes.size();
    }

    @Override
    public Episode next() {
        return shuffledEpisodes.get(index++);
    }
}
