package Practice_7.OtherTasks.Task16;

public class Task {
    String name;
    int dueTime;

    public Task(String name, int dueTime){
        this.dueTime = dueTime;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", сроки - " + dueTime;
    }
}
