package Practice_7.TreeMap.Task3;

import java.util.TreeMap;

public class Employee {
    //Реализуйте TreeMap, который хранит сотрудников и их ID,
    // с возможностью поиска ближайшего большего ID.
    private TreeMap<Integer, String> employee;
    public Employee(){
        this.employee = new TreeMap<>();
    }
    public void addEmployee(int id, String name){
        employee.put(id, name);
    }
    public void printMap(){
        employee.forEach((id, name)-> System.out.println("ID: "+id+", name: "+ name));
    }
    public void printBiggestID(){
        System.out.println(employee.lastKey());
    }
}
