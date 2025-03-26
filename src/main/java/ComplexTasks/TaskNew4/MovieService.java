package ComplexTasks.TaskNew4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MovieService {
    // Хранение оценок в Map<Movie, List<Rating>>.
    private final static HashMap<Movie, List<Rating>> ratingsList = new HashMap<>();

    // Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и
    // * валидировать оценку на допустимость (например, оценка должна быть в пределах от 1 до 10).
    public static synchronized void addRating(Rating rating, Movie movie) {
        try {
            double rating1 = rating.getRating().doubleValue();
            if ((rating1 < 1) || (rating1 > 10)) {
                throw new IllegalArgumentException("Оценка фильма должна быть от 1 до 10");
            }
            ratingsList.computeIfAbsent(movie, m -> new ArrayList<>()).add(rating);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при добавлении рейтинга - " + e.getMessage());
        }
    }

    // Возможность расчета средней оценки для каждого фильма.
    public static double averageRating(Movie movie) {
        List<Rating> ratings = ratingsList.get(movie);
        if (ratings == null){
            return 0;
        }
        return ratings.stream().mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(0);
    }

    // сортировки фильмов по средней оценке.
    public static List<String> sortedByRatingsList(){
        return ratingsList.keySet().stream()
                .sorted(Comparator.comparingDouble(MovieService::averageRating).reversed())
                .map(movie -> movie.getFilmName() + " - рейтинг: " + averageRating(movie))
                .toList();
    }
}
