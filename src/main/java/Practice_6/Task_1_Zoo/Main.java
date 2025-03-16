package Practice_6.Task_1_Zoo;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant("Limpopo", 3);
        Animal bird = new Bird("Coco", 1);

        Manager oleg = new Manager();
        oleg.animalMove(elephant);
        oleg.animalMakeSound(elephant);

        oleg.animalMove(bird);
        oleg.animalMakeSound(bird);
    }
}
