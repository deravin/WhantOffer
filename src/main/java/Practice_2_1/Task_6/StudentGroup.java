package Practice_2_1.Task_6;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    public String getGroupName(){
        return groupName;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }
    public void printInfo(){
        System.out.println("Группа: "+ groupName + ", Количество студентов: " + studentCount);
    }

    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup("QA", 45);
        studentGroup1.setStudentCount(25);
        studentGroup1.printInfo();
    }
}
