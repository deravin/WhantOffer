package Practice_7.LinkedHashSet_tasks.Task3;

import java.util.LinkedHashSet;

public class LinkedHashSetTask3 {
    //Реализуйте кэш последних 5 уникальных страниц, которые посетил пользователь.
    private LinkedHashSet<String> pages;
    public LinkedHashSetTask3(){
        this.pages = new LinkedHashSet<>();
    }

    public void addPages(String page){
        pages.add(page);
    }
    public void printLis(){
        pages.forEach(page -> System.out.print(page + " "));
        System.out.println();
    }
    public void printCashOfLast5Pages(){
        for (int i = pages.size(); i >= (pages.size()-5); i--){
            String lastPage = pages.getLast();
            System.out.println("последняя страница - " + lastPage);
        }
    }
}
