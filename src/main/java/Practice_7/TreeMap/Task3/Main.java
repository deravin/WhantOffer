package Practice_7.TreeMap.Task3;

public class Main {
    public static void main(String[] args) {
        Employee employeeList = new Employee();
        employeeList.addEmployee(2,"Anna");
        employeeList.addEmployee(1,"Kate");
        employeeList.addEmployee(5,"Bob");
        employeeList.addEmployee(7,"An");
        employeeList.addEmployee(3,"Jane");

        employeeList.printMap();

        employeeList.printBiggestID();
    }
}
