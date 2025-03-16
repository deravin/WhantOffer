package Practice_8_Exception.Task4;

import java.util.ArrayList;

public class ArrayTask {
    // Массив и выход за границы: Напишите программу,
    // которая запрашивает у пользователя индекс массива и обрабатывает ArrayIndexOutOfBoundsException.

    private ArrayList<Integer> arrayList;
    public ArrayTask(int x, int y, int d){
        this.arrayList = new ArrayList<>();
        this.arrayList.add(x);
        this.arrayList.add(y);
        this.arrayList.add(d);
    }

    public void printElementByIndex(int index){
        try {
            System.out.println(arrayList.get(index));
        } catch (IndexOutOfBoundsException e){
            System.out.println("такого индекса нет в массиве");
        } finally {
            System.out.println("Ты красава!");
        }
    }


}
