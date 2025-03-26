package practice_11_CodeTesting.Task3;

public class ReverseString {
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
