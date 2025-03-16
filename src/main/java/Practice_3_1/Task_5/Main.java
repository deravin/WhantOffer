package Practice_3_1.Task_5;

public class Main {
    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Game1", 5);
        GameSettings game2 = new GameSettings("Game2",1);

        GameSettings.setMaxPlayers(6);

        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();

        game1.addPlayer();
        game1.printGameStatus();
    }
}
