package Practice_6.Task_2_Pets;

public class Dog extends Pets{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void whatToDo() {
        System.out.println("Собака гуляет");
    }
}
