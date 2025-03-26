package ComplexTasks.Task1_UserSystem;

import java.time.LocalDateTime;
import java.util.Objects;

// User: id, username, passwordHash, role (USER, ADMIN), createdAt.
public class User {
    private final int id;
    private final String username;
    private String passwordHash;
    private final Role role;
    private final LocalDateTime localDateTime;

    public User(int id, String username, String password, Role role){
        this.id = id;
        this.username = username;
        this.passwordHash = setPasswordHash(password);
        this.role = role;
        localDateTime = LocalDateTime.now();
    }

    public static String setPasswordHash(String password){
        String passwordHash = String.valueOf(password.hashCode());
        return passwordHash;
    }

    public void changePassword(String newPassword){
        this.passwordHash = setPasswordHash(newPassword);
    }

    public boolean checkPassword(String password){
        return Objects.equals(getPasswordHash(),setPasswordHash(password));
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Role getRole() {
        return role;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
