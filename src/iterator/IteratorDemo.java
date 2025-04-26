package iterator;
import java.util.Arrays;

public class IteratorDemo {
    public static void main(String[] args) {
        Season season1 = new Season();
        season1.addEpisode(new Episode("Episode 1", 1200));
        season1.addEpisode(new Episode("Episode 2", 2000));
        season1.addEpisode(new Episode("Episode 3", 1500));
        Season season2 = new Season();
        season2.addEpisode(new Episode("Episode 1", 1800));
        season2.addEpisode(new Episode("Episode 2", 2200));
        season2.addEpisode(new Episode("Episode 3", 1000));

        System.out.println("--- Normal Order ---");
        printEpisodes(season1.getIterator());

        System.out.println("--- Reverse Order ---");
        printEpisodes(new ReverseSeasonIterator(season1.getEpisodes()));

        System.out.println("--- Shuffle Order ---");
        printEpisodes(new ShuffleSeasonIterator(season1.getEpisodes()));

        System.out.println("--- Skip Long Episodes ---");
        printEpisodes(new SkipLongEpisodesIterator(season1.getEpisodes()));

        System.out.println("--- Binge All Seasons ---");
        printEpisodes(new BingeIterator(Arrays.asList(season1, season2)));
    }

    private static void printEpisodes(EpisodeIterator iterator) {
        while (iterator.hasNext()) {
            Episode episode = iterator.next();
            if (episode != null) {
                System.out.println(episode);
            }
        }
        System.out.println();
    }
}

