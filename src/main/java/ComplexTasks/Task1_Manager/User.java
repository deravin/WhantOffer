package ComplexTasks.Task1_Manager;

public class User {
    private final String username;
    private final Activity activity;
    private final int age;

    public User(String username, Activity activity, int age){
        this.username = username;
        this.activity = activity;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public Activity getActivity() {
        return activity;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "username='" + username + '\'' +
                ", activity=" + activity +
                ", age=" + age +
                '}';
    }
}
