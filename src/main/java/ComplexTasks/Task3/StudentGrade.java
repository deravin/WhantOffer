package ComplexTasks.Task3;

public class StudentGrade <T extends Number>{
    private final String studentName;
    private final String subject;
    private final T grade;

    public StudentGrade(String studentName, String subject, T grade){
        this.subject = subject;
        this.grade = grade;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "'" + studentName + '\'' +
                ", '" + subject + '\'' +
                ", " + grade ;
    }
}
