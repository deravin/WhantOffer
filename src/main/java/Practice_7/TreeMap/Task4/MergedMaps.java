package Practice_7.TreeMap.Task4;

import java.util.TreeMap;

public class MergedMaps {
    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        TreeMap<Integer, String> map2 = new TreeMap<>();

        map1.put(3, "Apple");
        map1.put(2, "Orange");
        map1.put(1, "Tomato");
        map1.put(4, "Grape");

        map2.put(6, "Kakao");
        map2.put(1, "Tea");
        map2.put(4, "Milk");
        map2.put(7, "Water");

        mergeMaps(map1, map2);
        System.out.println(map1);

    }
    //метод, который объединяет два TreeMap, удаляя дубликаты.
      public static void mergeMaps(TreeMap<Integer, String> map1, TreeMap<Integer, String> map2){
        map1.putAll(map2);
      }
    }

