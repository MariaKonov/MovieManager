public class Movie {
    private int id;
    private String name;
    private String movieGenre;

    private boolean premiereTomorrow;

    public Movie(int id, String name, String movieGenre, boolean premiereTomorrow) {
        this.id = id;
        this.name = name;
        this.movieGenre = movieGenre;
        this.premiereTomorrow = premiereTomorrow;
    }
}