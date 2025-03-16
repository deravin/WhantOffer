package Practice_7.OtherTasks.Task19;

public class Player {
    protected String name;
    protected int rating;

    public Player(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Player: " +
                "name ='" + name + '\'' +
                ", rating = " + rating +
                '}';
    }
}
