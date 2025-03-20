package practice_11.Task17;

public class PasswordCheck {
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
    }
}
