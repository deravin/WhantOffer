package Practice_8__Generics.Task2;


import java.util.List;
import java.util.Objects;

public class printList {
    //Реализуйте метод printList(List<?>), который принимает список любого типа и выводит его элементы.
    public static void printList(List<?> list){
        for (Object element : list){
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,5,6,7,8,9);
        List<String> words = List.of("Яблоко", "Груша");

        printList(numbers);
        printList(words);
    }
}
