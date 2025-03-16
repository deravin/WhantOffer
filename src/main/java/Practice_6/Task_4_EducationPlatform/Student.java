package Practice_6.Task_4_EducationPlatform;

public class Student extends Course{

    public Student(String name) {
        super(name);
    }

    @Override
    public void workWithInfo() {
        System.out.println("Ученик учится на курсе");
    }
    public void study(){
        System.out.println("Студенты учатся. Фиксируется их прогресс");
    }
}
