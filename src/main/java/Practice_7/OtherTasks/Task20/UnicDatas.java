package Practice_7.OtherTasks.Task20;

import java.util.HashSet;

public class UnicDatas {
    //20. Проверка дубликатов в потоке данных
    //Данные поступают в потоковом режиме, и нужно проверять, был ли данный элемент уже получен ранее.
    private HashSet<String> unicData;
    public UnicDatas(){
        this.unicData = new HashSet<>();
    }

    public void addElement(String element){
        unicData.add(element);
    }

    public boolean checkDoesElementExist(String element){
        if (unicData.contains(element)){
            System.out.println("елемент уже был добавлен");
            return true;
        } else {
            System.out.println("элемента еще не было, добавляю");
            unicData.add(element);
        } return false;
    }
}
