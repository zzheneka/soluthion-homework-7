package iterator;

import java.util.List;

public class BingeIterator implements EpisodeIterator {
    private final List<Season> seasons;
    private int seasonIndex = 0;
    private EpisodeIterator currentIterator;

    public BingeIterator(List<Season> seasons) {
        this.seasons = seasons;
        if (!seasons.isEmpty()) {
            currentIterator = seasons.get(0).getIterator();
        }
    }

    @Override
    public boolean hasNext() {
        while (currentIterator != null && !currentIterator.hasNext()) {
            seasonIndex++;
            if (seasonIndex < seasons.size()) {
                currentIterator = seasons.get(seasonIndex).getIterator();
            } else {
                currentIterator = null;
            }
        }
        return currentIterator != null && currentIterator.hasNext();
    }

    @Override
    public Episode next() {
        if (hasNext()) {
            return currentIterator.next();
        }
        return null;
    }
}
