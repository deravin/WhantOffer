package Practice_7.TreeSet_tasks.Task4;

import java.util.TreeSet;

public class UserList {
    //Реализуйте сортировку пользователей по имени с TreeSet и Comparator.
    private TreeSet<String> userList;
     public UserList(){
         this.userList = new TreeSet<>();
     }
     public void addUser(String name){
         userList.add(name);
     }
     public void printList(){
         userList.forEach(element -> System.out.print(element + " "));
     }

}
