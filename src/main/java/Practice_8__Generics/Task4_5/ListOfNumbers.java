package Practice_8__Generics.Task4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListOfNumbers {
    //Ограничение сверху: Напишите обобщённый метод, который принимает List<? extends Number> и вычисляет сумму элементов.
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for (Number number: list){
            sum = sum + number.doubleValue();
        }
        return sum;
    }
    // Ограничение снизу: Реализуйте метод, который принимает List<? super Integer> и добавляет в него несколько чисел.

    public static void addNumbers(List<? super Integer> listOfNumbers){
        listOfNumbers.add(10);
        listOfNumbers.add(300);
        listOfNumbers.add(9000);
    }


    public static void main(String[] args) {
        List<Integer> intList = List.of(2,3,45,6,7,0);
        List<Integer> newList = new ArrayList<>();
        List<Double> doubleList = List.of(46.7,8.2233,0.766,9.4446);
        List<Object> o = new ArrayList<>();

        addNumbers(o);
        System.out.println(o);

    }
}
