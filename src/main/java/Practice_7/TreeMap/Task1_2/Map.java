package Practice_7.TreeMap.Task1_2;

import java.util.TreeMap;

public class Map {
    //Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы).
    // Выведите отсортированные данные.
    private TreeMap<String,Integer> map;
    public Map(){
        this.map = new TreeMap<>();
    }
    public void addElement(String name, int point){
        map.put(name,point);
    }
    public void printMap(){
        map.forEach((name,point)-> System.out.println(name + " , " + point + " . "));
    }
    //Найдите минимальный и максимальный ключ в TreeMap.
    public void printMinKey(){
        System.out.println(map.firstKey());
    }
    public void printMaxKey(){
        System.out.println(map.lastKey());
    }
}
