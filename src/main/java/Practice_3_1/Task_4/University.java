package Practice_3_1.Task_4;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    public University(String studentName, int studentID){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public static void changeUniversityName(String newName){
        universityName = newName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void printStudentInfo(){
        System.out.println("Student name - "+studentName+". StudentID - " + studentID + ". Univercity - "+universityName);
    }

    }
