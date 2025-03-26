package ComplexTasks.Task2_DataValidator;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", 23, "rtweruy@mail.ru");
        User user2 = new User("Bob", 23, "rtweruy@mail.ru");
        User user3 = new User("" , 10, "");

        UserValidator.validationEnabled = false;



        UserValidator.validateEmail(user3);

    }
}
