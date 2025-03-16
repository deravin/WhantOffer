package Practice_8__Generics.Task3;

import java.util.ArrayList;
import java.util.List;

//Работа с числами: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.
public class NumberBox <T extends Number> {
    private List<T> numbers;
    private NumberBox(List<T> numbers){
        this.numbers = numbers ;
    }

    public double sum(){
        double sum = 0;
        for (T number : numbers){
            sum = sum + number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(3,4,5,0);
        List<Double> doubleList = List.of(4.5,7.9,3.444,6.111123);

        NumberBox<Integer> intBox = new NumberBox<>(intList);
        NumberBox<Double> doubleNumberBox = new NumberBox<>(doubleList);

        System.out.println(intBox.sum());
        System.out.println(doubleNumberBox.sum());
    }
}
