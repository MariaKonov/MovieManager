import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void Test(){
        Movie mov = new Movie(
                879,
                "Один дома",
                "Комедия",
                true
        );
        mov.equals(true);
        System.out.println(mov.equals(true));
    }
    @Test
    public void addMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOverLimitTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");

        String[] expected = {"Film 1", "Film 2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindAllLimitTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastSevenMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");

        String[] actual = manager.findLast();
        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest2() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
