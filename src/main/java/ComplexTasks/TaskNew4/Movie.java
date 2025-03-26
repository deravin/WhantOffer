package ComplexTasks.TaskNew4;

public class Movie {
    private final String filmName;

    public Movie(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmName() {
        return filmName;
    }

    @Override
    public String toString() {
        return "filmName='" + filmName;
    }
}
