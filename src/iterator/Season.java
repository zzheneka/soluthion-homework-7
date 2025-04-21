package iterator;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private final List<Episode> episodes;

    public Season() {
        this.episodes = new ArrayList<>();
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
