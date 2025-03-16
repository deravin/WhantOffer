package Practice_6.Task_1_Zoo_1;

public class Elephant extends Animal{

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Слон трубит");
    }

    @Override
    public void move() {
        System.out.println("Cлон ходит");
    }
}
