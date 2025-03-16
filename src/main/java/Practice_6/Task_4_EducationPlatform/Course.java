package Practice_6.Task_4_EducationPlatform;

public abstract class Course {
    private static String courseName;
    private String name;

    public Course(String name){
        this.name = name;
    }

    public static String getCourseName() {
        return courseName;
    }
    public static void setCourseName(String n){
        courseName = n;
    }


    public abstract void workWithInfo();

    public void printInfo(){
        System.out.println("Курс " + courseName + " Это: " + this.name);
    }
}
