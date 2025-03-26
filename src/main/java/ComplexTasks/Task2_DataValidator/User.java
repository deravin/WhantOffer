package ComplexTasks.Task2_DataValidator;

public class User {
    private final String userName;
    private final int age;
    private final String email;

    public User(String userName, int age, String email){
        this.age = age;
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

}
