package Practice_7.ArrayList_tasks.Task2.DeleteAllEvenNumbers;

import java.util.ArrayList;

public class DeleteEvenNumbers {
    private ArrayList<Integer> numbers;

    public DeleteEvenNumbers(){
        this.numbers = new ArrayList<>();
    }

    public void addNumbers(int number){
        numbers.add(number);
    }

    public void printNumbers(){
        numbers.forEach(System.out::println);
        System.out.println();
    }

    public void deleteAllEvenNumbers(){
        numbers.removeIf(number -> number % 2 == 0);
    }
}
