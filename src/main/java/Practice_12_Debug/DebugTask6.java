package Practice_12_Debug;

// Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.
public class DebugTask6 {
    public static void main(String[] args) {
        countdown(9);
    }

    public static void countdown(int n) {
        while (n >= 1) {
            System.out.println(n);
            n -- ; // Нет условия выхода!
        }
    }
}

