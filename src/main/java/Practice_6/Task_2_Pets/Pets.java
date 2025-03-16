package Practice_6.Task_2_Pets;

public abstract class Pets {
    private String name;
    private int age;

    public Pets(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public abstract void eat();
    public abstract void whatToDo();

    public void printPetsInfo(){
        System.out.println("Имя - "+ this.name + ", возраст - " + age);
    }
}
