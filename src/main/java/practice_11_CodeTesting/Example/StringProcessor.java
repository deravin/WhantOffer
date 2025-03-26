package practice_11_CodeTesting.Example;

public class StringProcessor {

    // Метод для проверки строки
    public String reverse(String input){
        if (input == null){
            throw new IllegalArgumentException("Input can't be null");
        }
        return new StringBuilder(input).reverse().toString();
    }


    public boolean isPalindrom(String input){
        if (input == null){
            throw new IllegalArgumentException("Input can't be null");
        }
        String reverse = new StringBuilder(input).reverse().toString();
        return input.equals(reverse);
    }

    public String validateLength(String input, int minLength){
        if (input == null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (input.length() < minLength) {
            throw new IllegalArgumentException("Input must be at least " + minLength);
        }
        return input;
    }
}
