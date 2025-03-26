package ComplexTasks.Task1_UserSystem;
// Admin: наследует User, имеет расширенные права.
public class Admin extends User{
    public Admin(int id, String username, String password){
        super(id, username, password, Role.ADMIN);
    }
}
