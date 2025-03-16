package Practice_6.Task_1_Zoo_1;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant("Limpopo", 3);
        Animal bird = new Bird("Coco", 1);

        Manager oleg = new Manager();

        oleg.showWhatYouCan(elephant);
        oleg.showWhatYouCan(bird);
    }
}
