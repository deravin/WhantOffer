package Practice_12_Debug;
// Код должен напечатать все элементы массива, но вместо этого выбрасывает исключение.

public class DebugTask1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) { // Ошибка в условии
            System.out.println(numbers[i]);
        }
    }
}
