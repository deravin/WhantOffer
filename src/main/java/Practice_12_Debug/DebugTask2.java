package Practice_12_Debug;
// Код должен вычислить сумму чисел от 1 до 5, но почему-то результат неправильный.
public class DebugTask2 {
    public static void main(String[] args) {
        int sum = calculateSum(5);
        System.out.println("Sum: " + sum); // Ожидаем 15
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // Ошибка в шаге цикла
            sum += i;
        }
        return sum;
    }
}

