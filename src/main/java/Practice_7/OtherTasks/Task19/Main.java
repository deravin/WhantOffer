package Practice_7.OtherTasks.Task19;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Anna", 120);
        Player player2 = new Player("Nina", 100);
        Player player3 = new Player("Sasha", 220);
        Player player4 = new Player("Alice", 20);
        Player player5 = new Player("Bob", 999);

        RatingSystem ratingTable = new RatingSystem();
        ratingTable.addPlayer(player1);
        ratingTable.addPlayer(player2);
        ratingTable.addPlayer(player5);
        ratingTable.addPlayer(player4);
        ratingTable.addPlayer(player3);

        System.out.println(ratingTable.playerWithMaxRating());
    }
}
