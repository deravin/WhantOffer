package practice_11.Task10;

public class PhoneNumberValidator {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
