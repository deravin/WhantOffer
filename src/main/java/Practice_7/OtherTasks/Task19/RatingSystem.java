package Practice_7.OtherTasks.Task19;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RatingSystem {
    //19. Система рейтингов
    //Вам нужно хранить список игроков с их рейтингами,
    // чтобы быстро находить игрока с самым высоким рейтингом.
    private PriorityQueue<Player> maxRating;
    public RatingSystem(){
        this.maxRating = new PriorityQueue<>(Comparator.comparingInt(player -> -player.rating));
    }
    public void addPlayer(Player player){
        maxRating.add(player);
    }
    public Player playerWithMaxRating(){
        return maxRating.peek();
    }

}
