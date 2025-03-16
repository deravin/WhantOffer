package Practice_3_1.Task_1;

public class Company {
    private static String companyName;
    private final int employeeID;
    private String employeeName;

    public Company(String employeeName, int employeeID){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }
    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String name){
        this.employeeName = name;
    }
    public static void setCompanyName(String name){
        companyName = name;
    }
}
