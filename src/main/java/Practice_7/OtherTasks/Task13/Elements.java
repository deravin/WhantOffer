package Practice_7.OtherTasks.Task13;

import java.util.ArrayList;

public class Elements {
    //13. Хранение объектов с частым доступом
    //Требуется хранить фиксированное количество элементов, которые часто изменяются,
    // с быстрым доступом к любому из них.

    private ArrayList<String> list;
    public Elements(){
        this.list = new ArrayList<>();
    }
    public void addElement(String element){
        list.add(element);
    }
    public void updateElement(int index, String newValue){
        if (index < list.size()) {
            list.set(index, newValue);
        } else System.out.println("вышли за пределы списка");
    }
    public void showElement(int index){
        if (index < list.size()) {
            String value = list.get(index);
            System.out.println(value);
        } else System.out.println("вышли за пределы списка");
    }
}
