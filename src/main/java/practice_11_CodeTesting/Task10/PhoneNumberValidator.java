package practice_11_CodeTesting.Task10;

public class PhoneNumberValidator {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
