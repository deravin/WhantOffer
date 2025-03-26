package ComplexTasks.Task3;

import ComplexTasks.Task2_DataValidator.InvalidUserException;

import java.util.ArrayList;

public class GradeService<T extends Number> {
    // Список List<StudentGrade<T>> для хранения оценок.
    public ArrayList<StudentGrade<T>> studentGradeList = new ArrayList<>();

    // Метод для добавления оценки (addGrade), который также
    // валидирует оценку на предмет того, что она не отрицательна.
    // Обработка исключений через InvalidGradeException, если оценка некорректна.
    public synchronized void addGrade(StudentGrade<T> grade) {
        try {
            if (grade.getGrade().doubleValue() < 0) {
                throw new InvalidUserException("оценка не может быть отрицательной!");
            }
            studentGradeList.add(grade);
        } catch (InvalidUserException e) {
            System.out.println("Ошибка при добавлении оценки." + e.getMessage());
        }
    }

    // Метод для расчёта среднего значения оценок по конкретному предмету.
    public double averageGradeValue(String subject) {
        return studentGradeList.stream()
                .filter(g -> g.getSubject().equalsIgnoreCase(subject))
                .mapToDouble(g -> g.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Оценки по предмету " + subject + " не найдены"));
    }
}

