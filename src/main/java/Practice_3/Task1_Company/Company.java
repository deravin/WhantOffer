package Practice_3.Task1_Company;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    static void printCompanyName(){
        System.out.println(companyName);
    }
    String getEmployeeName(){
        return employeeName;
    }
    void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

}
