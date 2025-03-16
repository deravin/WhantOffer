package Practice_7.OtherTasks.Task1;

import java.util.HashMap;

public class Users {
    //В системе есть список уникальных идентификаторов пользователей. Необходимо быстро проверять,
    // присутствует ли пользователь с заданным идентификатором.
    // данные - пользователь с уникальным ID, ключ (ID) - значение (имя)
    // быстрый поиск по ID
    private HashMap <Integer,String> users;
    public Users(){
        this.users = new HashMap<>();
    }
    public void addUser(Integer id, String name){
        users.put(id,name);
    }
    public void printUserList(){
        users.forEach((id, name) -> System.out.print("ID: " + id + ", Name: " + name + " ; "));
        System.out.println();
    }
    public boolean checkUserByID(int id){
        return users.containsKey(id);
    }


}
