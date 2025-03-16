package Practice_7.ArrayList_tasks.Task2.DeleteAllEvenNumbers;

public class Main {
    public static void main(String[] args) {
        DeleteEvenNumbers numbers = new DeleteEvenNumbers();

        numbers.addNumbers(1);
        numbers.addNumbers(4);
        numbers.addNumbers(8);
        numbers.addNumbers(3);
        numbers.addNumbers(15);
        numbers.addNumbers(16);

        numbers.printNumbers();

        numbers.deleteAllEvenNumbers();

        numbers.printNumbers();
    }
}
