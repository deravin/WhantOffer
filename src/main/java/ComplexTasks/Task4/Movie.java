package ComplexTasks.Task4;

public class Movie {
    private final String filmName;
    private final int year;

    public Movie(String filmName, int year) {
        this.filmName = filmName;
        this.year = year;
    }

    public String getFilmName() {
        return filmName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "filmName='" + filmName + '\'' +
                ", year=" + year +
                '}';
    }
}
