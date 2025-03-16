package Practice_3.Task5_GameSettings;

public class Main {
    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("First game", 2);
        GameSettings game2 = new GameSettings("Second game", 5);

        GameSettings.setMaxPlayers(1);

        game1.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();

        game2.printGameStatus();
        game2.addPlayer();
        game2.printGameStatus();



    }
}
