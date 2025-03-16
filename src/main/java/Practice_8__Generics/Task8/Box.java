package Practice_8__Generics.Task8;

import java.util.Comparator;
//Сортировка с Comparable<T>: Напишите класс Box<T extends Comparable<T>>, который хранит объект и умеет сравнивать его с другим.
public class Box <T extends Comparable<T>>{
    private T object;
    public Box(T object){
        this.object = object;
    }
    public T getObject(){
        return object;
    }
    public void compareTo (Box<T> object2) {
        int result = object.compareTo(object2.getObject());
        if (result > 0) {
            System.out.println("объект 1 больше");
        } else if (result == 0) {
            System.out.println("объекты равны");
        } else {
            System.out.println("объект 2 больше");
        }
    }

    public static void main(String[] args) {
        Box<String> str1 = new Box<>("Hello");
        Box<String> str2 = new Box<>("Hello");

        Box<Integer> int1 = new Box<>(33);
        Box<Integer> int2 = new Box<>(33);

        int1.compareTo(int2);
        str2.compareTo(str1);

    }
}
