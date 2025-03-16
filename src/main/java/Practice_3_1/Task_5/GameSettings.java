package Practice_3_1.Task_5;

public class GameSettings {
    static int maxPlayers ;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    public static void setMaxPlayers(int newMax){
        maxPlayers = newMax;
    }
    public void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        } else {
            System.out.println("Превышено максимальное количество игроков");
        }
    }
    public void printGameStatus(){
        System.out.println("Game name - " + gameName + ", current players - " + currentPlayers + ", maximum playears - " + maxPlayers);
    }

}
