package Practice_3.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.studentCount);
        Student sasha = new Student(12, "tytu");
        System.out.println(Student.studentCount);
        Student kolya = new Student(20, "sdf");
        System.out.println(Student.studentCount);

    }
}
