package Practice_3.Task4_University;

public class Main {
    public static void main(String[] args) {
        University student1 = new University(1,"Ann");
        University studen2 = new University(2, "Bob");
        University student3 = new University(3,"Kate");

        University.universityName = "Garvard";

        student1.printStudentInfo();
        studen2.printStudentInfo();
        student3.printStudentInfo();
    }
}
