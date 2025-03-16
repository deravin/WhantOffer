package Practice_8__Generics.Task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapWithUnknownTypes <K,V> {
    // Коллекция с обобщёнными типами: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.
    private Map<K,V> map;
    public MapWithUnknownTypes(){
        this.map = new HashMap<>();
    }
    public void addElement(K key, V value){
        map.put(key,value);
    }
    public void printMap(){
        for (Map.Entry<K,V> enty : map.entrySet()){
            System.out.println(" ключ - " + enty.getKey() + ", значение - " + enty.getValue());
        }
    }
}
