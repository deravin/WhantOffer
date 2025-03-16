package Practice_7.OtherTasks.Task1;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        users.addUser(1, "Anna");
        users.addUser(2, "Kate");
        users.addUser(3, "Ann");
        users.addUser(1, "Bob");
        users.addUser(4, "Alice");
        users.addUser(4, "Jane");

        users.printUserList();
        System.out.println(users.checkUserByID(9));
    }
}
