package Practice_6.Task_1_Zoo_1;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
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

    public void showInfo(){
        System.out.println("Привет, я "+ this.name + ", мне "+ this.age + " лет");
    }
}
