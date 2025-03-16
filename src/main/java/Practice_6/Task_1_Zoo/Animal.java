package Practice_6.Task_1_Zoo;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String animalName, int age){
        this.name = animalName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
    public abstract void move();
}
