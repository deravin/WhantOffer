package ComplexTasks.Task3;

import ComplexTasks.Task2_DataValidator.InvalidUserException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GradeService<Number> grades = new GradeService<>();
        Thread t1 = new Thread(() -> {
            grades.addGrade(new StudentGrade<>("Alice", "math", 6));
            grades.addGrade(new StudentGrade<>("Alice2", "eng", 10));
        });

       Thread t2 = new Thread(() -> {
           grades.addGrade(new StudentGrade<>("Alice3", "math", 2));
           grades.addGrade(new StudentGrade<>("Alice4", "rus", 3));
       });

       t1.start();
       t2.start();
       t1.join();
       t2.join();

       System.out.println(grades.studentGradeList);

        try {
            System.out.println(grades.averageGradeValue("math"));
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
