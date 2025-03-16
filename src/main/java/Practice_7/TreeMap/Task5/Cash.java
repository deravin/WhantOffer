package Practice_7.TreeMap.Task5;

import java.util.Iterator;
import java.util.TreeMap;

public class Cash {
    //Реализуйте механизм кэширования,
    // где ключи автоматически удаляются, если они устарели.
    private TreeMap<Integer, String> cash;
    public Cash(){
        this.cash = new TreeMap<>();
    }
    public void addObject(int key, String value){
        cash.put(key, value);
    }
    public void printMap(){
        cash.forEach((key,value) -> System.out.print( key + " , " + value + " ; "));
        System.out.println();
    }
    public void deleteOldKey() throws InterruptedException {
        Iterator<Integer> iterator = cash.keySet().iterator();
        while (iterator.hasNext()) {
            if(cash.isEmpty()){
                System.out.println("кэш пустой");
                break;
            }
            cash.forEach((key,value) -> System.out.print( key + " , " + value + " ; "));
            System.out.println();
            Thread.sleep(1000);
            int firstKey = cash.firstKey();
            System.out.println("now first key is - " + firstKey);
            cash.remove(firstKey);
        }
    }
}
