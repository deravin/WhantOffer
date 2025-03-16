package Practice_7.HashSet_tasks.Task5;

import java.util.HashSet;
import java.util.Iterator;

public class SimpleCash {
    // Реализуйте кэш из HashSet, который автоматически удаляет старые записи через определённый интервал.
    private HashSet<Integer> cash;

    public SimpleCash(){
        this.cash = new HashSet<>();
    }
    public void addElement(int e){
        cash.add(e);
    }
    public void printSet(){
        cash.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public boolean isSetEmpty(){
        return cash.isEmpty();
    }

    public void deleteCash() throws InterruptedException {
        Iterator<Integer> iterator = cash.iterator();
        while (iterator.hasNext()){
            Thread.sleep(1000);
            System.out.println("элемент " + iterator.next() + " сейчас будет удален." );
            iterator.remove();
            System.out.println("теперь список выглядит так - ");
            cash.forEach(element -> System.out.print(element + " "));
            System.out.println();
        }
        System.out.println("теперь список пустой");
    }
}
