package Practice_12_Debug;
// Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.
public class DebugTask4 {
    public static void main(String[] args) {
        try {
            System.out.println(isPalindrome("Joke"));
        } catch (NullPointerException e){
            System.out.println("Строка пустая, введите корректное слово");
        }
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString().toLowerCase();
        return str.toLowerCase().equals(reversed);
    }
}
