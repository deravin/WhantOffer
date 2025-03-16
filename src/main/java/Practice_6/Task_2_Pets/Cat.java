package Practice_6.Task_2_Pets;

public class Cat extends Pets{
   public Cat(String name, int age){
       super(name,age);
   }

    @Override
    public void eat() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void whatToDo() {
        System.out.println("Кошка играет");
    }
}
