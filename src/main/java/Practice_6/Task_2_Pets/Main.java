package Practice_6.Task_2_Pets;

import Practice_6.Task_1_Zoo.Animal;
import Practice_6.Task_1_Zoo.Manager;

public class Main {
    public static void main(String[] args) {
        Pets cat = new Cat("Lusy",3);
        Pets dog = new Dog("Sharik",1);

        PetsManager katya = new PetsManager();
        katya.showWhatYoyCanDo(cat);
        katya.showWhatYoyCanDo(dog);

    }
}
