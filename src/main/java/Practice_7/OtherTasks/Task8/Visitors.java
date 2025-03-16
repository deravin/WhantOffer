package Practice_7.OtherTasks.Task8;

import java.util.HashSet;

public class Visitors {
    //Учет посещений страниц
    //Система должна отслеживать уникальные посещения страниц на веб-сайте и вести подсчёт общего числа посещений.

    private HashSet<String> visitors;
    public Visitors(){
        this.visitors = new HashSet<>();
    }
    public void addVisitor(String name){
        visitors.add(name);
    }
    public int showNumbersOfVisitors(){
        return visitors.size();
    }


}
