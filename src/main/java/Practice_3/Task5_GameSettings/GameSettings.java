package Practice_3.Task5_GameSettings;

public class GameSettings {
    private static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers ) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    static void setMaxPlayers(int newMax){
       maxPlayers = newMax;
    }
    public void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        } else {
            System.out.println("There is limit for players");
        }
    }
    public void printGameStatus(){
        System.out.println("Game: " + gameName + ". Current players: " + currentPlayers + ". Maximum players: " + maxPlayers);
    }


}
