package Practice_6.Task_4_EducationPlatform;

public class Teacher extends Course{

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void workWithInfo() {
        System.out.println("Учитель проверяет задание");
    }
    public void checkWork(){
        System.out.println("Учитель проверяет задание");
    }


}
