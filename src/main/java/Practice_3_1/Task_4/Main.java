package Practice_3_1.Task_4;

import Practice_3.Student.Student;

public class Main {
    public static void main(String[] args) {
        University student1 = new University("Anna", 18);
        University student2 = new University("Bob", 19);
        University student3 = new University("Kate",17);

        University.changeUniversityName("Garvard");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
