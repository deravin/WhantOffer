package Practice_2.Task6_StudentGroup;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName(){
        return groupName;
    }
    int getStudentCount(){
        return studentCount;
    }
    void setGroupName(String groupName){
        this.groupName = groupName;
    }
    void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }
    void printInfo(){
        System.out.println("Группа: " + groupName + ", Количество студентов: " + studentCount);
    }

    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("QA", 20);
        group1.setStudentCount(25);
        group1.printInfo();
    }

}
