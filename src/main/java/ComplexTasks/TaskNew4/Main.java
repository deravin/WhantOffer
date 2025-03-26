package ComplexTasks.TaskNew4;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Film1");
        Movie movie2 = new Movie("Film2");
        Movie movie3 = new Movie("Film3");

        Rating r9 = new Rating<>(9);
        Rating r8 = new Rating<>(8);
        Rating r7 = new Rating<>(7);
        Rating r6 = new Rating<>(6);

        MovieService.addRating(r9,movie1);
        MovieService.addRating(r6,movie3);
        MovieService.addRating(r9,movie3);
        MovieService.addRating(r8,movie3);
        MovieService.addRating(r9,movie3);

        System.out.println(MovieService.averageRating(movie3));

        System.out.println(MovieService.sortedByRatingsList());


    }
}
