package ComplexTasks.Task4;

import java.util.*;

public class MovieService {
    // Хранение оценок в Map<Movie, List<Rating>>.
    private static final HashMap<Movie, ArrayList<Rating>> ratingList = new HashMap<>();


    // Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и
    // валидировать оценку на допустимость (например, оценка должна быть в пределах от 1 до 10).
    public static synchronized void addRating(Movie movie, Rating rating){
        try {

            if (rating.getRating().doubleValue() < 1 || rating.getRating().doubleValue() > 10) {
                throw new IllegalArgumentException("Оценка должна быть в пределах 1 - 10");
            }
            ratingList.computeIfAbsent(movie, m -> new ArrayList<>()).add(rating);
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка ввода рейтинга - " + e.getMessage());
        }
    }

    //Возможность расчета средней оценки для каждого фильма.
    public static double averageRating(Movie movie){
        List<Rating> ratings = ratingList.get(movie);
        if (ratings == null || ratings.isEmpty()){
            return 0;
        }
         return ratings.stream()
                 .mapToDouble(r->r.getRating().doubleValue())
                 .average()
                 .orElse(0);
    }
    public static List<String> sortingByRatings () {
        return ratingList.keySet().stream()
                .sorted(Comparator.comparingDouble(MovieService::averageRating).reversed()) // Сортируем по убыванию рейтинга
                .map(movie -> movie.getFilmName() + " — рейтинг: " + averageRating(movie))
                .toList();
    }
}
