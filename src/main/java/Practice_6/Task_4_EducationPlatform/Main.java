package Practice_6.Task_4_EducationPlatform;

public class Main {
    public static void main(String[] args) {
        Course teacher1 = new Teacher("Алла Петровна");
        Course student1 = new Student("Петя");

        List list = new List();
        Course.setCourseName("English");

        list.newDay(teacher1);
        list.newDay(student1);
    }
}
