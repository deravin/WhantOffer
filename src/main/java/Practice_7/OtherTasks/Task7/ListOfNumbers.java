package Practice_7.OtherTasks.Task7;

import java.util.TreeSet;

public class ListOfNumbers {
    //Упорядоченный список
    //Необходимо хранить список чисел в отсортированном виде,
    // чтобы быстро находить минимальное и максимальное значения.

    private TreeSet<Integer> sortedList;
    public ListOfNumbers(){
        this.sortedList = new TreeSet<>();
    }
    public void addNumber(int number){
        sortedList.add(number);
    }
    public int printMaxNumber(){
      return sortedList.getLast();
    }

    public int printMinNumber(){
        return sortedList.getFirst();
    }

    public void printList(){
        sortedList.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }



}
