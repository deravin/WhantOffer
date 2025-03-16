package Practice_7.ArrayList_tasks.Task1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOf5Numbers {
    private ArrayList<Integer> numbers;

    public ListOf5Numbers(int x, int y, int d, int a, int g){
        this.numbers = new ArrayList<>();
        numbers.add(x);
        numbers.add(y);
        numbers.add(d);
        numbers.add(a);
        numbers.add(g);
    }

    public void addNumbers(int number){
        numbers.add(number);
    }

    public void printAllNumbers(){
        numbers.forEach(System.out::println);
        System.out.println();
    }
}
