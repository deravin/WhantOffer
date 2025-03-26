package ComplexTasks.TaskNew3;

import java.util.LinkedList;

public class GradeService <T extends Number>{
    // Список List<StudentGrade<T>> для хранения оценок.
    public LinkedList<StudentGrade<T>> gradeList = new LinkedList<>();

    // Метод для добавления оценки (addGrade), который также валидирует оценку на предмет того, что она не отрицательна.
    // Обработка исключений через InvalidGradeException, если оценка некорректна.
    public synchronized void addGrade(StudentGrade<T> grade){
        try {
            if (grade.getGrade().doubleValue() < 1) {
                throw new InvalidGradeException("Оценка меньше 1 недопустима");
            }
            gradeList.add(grade);
        } catch (InvalidGradeException e){
            System.out.println("Введена некорректная оценка - " + grade + e.getMessage());
        }
    }

    // Метод для расчёта среднего значения оценок по конкретному предмету.
    public double averageGradeForSubject(String subject){
        return gradeList.stream()
                .filter(studentGrade -> studentGrade.getSubject().equalsIgnoreCase(subject))
                .mapToDouble(studentGrade -> studentGrade.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Оценки по предмету " + subject + " не найдены"));
    }
}
