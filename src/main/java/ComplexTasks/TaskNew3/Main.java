package ComplexTasks.TaskNew3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GradeService gradeService = new GradeService();

        Thread t1 = new Thread(
                () -> {
                    gradeService.addGrade(new StudentGrade("Alice", "math", 8));
                    gradeService.addGrade(new StudentGrade("Kate", "math", 6));
                }
        );

        Thread t2 = new Thread(
                () -> {
                    gradeService.addGrade(new StudentGrade("AliceW", "math", 8));
                    gradeService.addGrade(new StudentGrade("Bob", "eng", -1));
                    gradeService.addGrade(new StudentGrade("Jane", "math", 8));
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(gradeService.gradeList);

        System.out.println(gradeService.averageGradeForSubject("math"));
    }
}
