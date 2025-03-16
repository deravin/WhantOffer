package Practice_7.TreeSet_tasks.Task4;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Task4 {
    //Реализуйте сортировку пользователей по имени с TreeSet и Comparator.
    TreeSet<String> set;
    public Task4(String x, String o, String z, String y, String r){
        this.set = new TreeSet<>(List.of(x,o,z,y,r));
    }
    public void printSet(){
        set.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }
    public void sortByName(){

    }
}
