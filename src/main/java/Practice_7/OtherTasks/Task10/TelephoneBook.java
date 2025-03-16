package Practice_7.OtherTasks.Task10;

import java.util.HashMap;
import java.util.TreeMap;

public class TelephoneBook {
    //10. Структура телефонной книги
    //Требуется хранить имена и номера телефонов, чтобы быстро находить номер по имени.

    private TreeMap<String, String> telephoneBook;
    public TelephoneBook(){
        this.telephoneBook = new TreeMap<>();
    }
    public void addNumber(String name, String number){
        telephoneBook.put(name, number);
    }
    public void findNumberByName(String name){
        if (telephoneBook.containsKey(name)){
            System.out.println(telephoneBook.get(name)); }
        else System.out.println("имя не найдено");
    }
    public void printBook(){
        System.out.println(telephoneBook);
    }
}
