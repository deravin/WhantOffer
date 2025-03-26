package ComplexTasks.Task4;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("movie1", 1990);
        Movie movie2 = new Movie("movie2", 1990);

        MovieService.addRating(movie1, new Rating(9));
        MovieService.addRating(movie1, new Rating(9));
        MovieService.addRating(movie2, new Rating(8));
        MovieService.addRating(movie2, new Rating(8));

        System.out.println(MovieService.averageRating(movie1));
        System.out.println(MovieService.averageRating(movie2));

        MovieService.sortingByRatings().forEach(System.out::println);

    }
}
