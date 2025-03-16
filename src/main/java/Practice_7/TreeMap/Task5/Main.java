package Practice_7.TreeMap.Task5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cash cash = new Cash();
        cash.addObject(1,"String1");
        cash.addObject(2,"String2");
        cash.addObject(3,"String3");
        cash.addObject(4,"String4");
        cash.addObject(5,"String5");
        cash.addObject(6,"String6");
        cash.addObject(7,"String7");

        cash.deleteOldKey();

    }
}
