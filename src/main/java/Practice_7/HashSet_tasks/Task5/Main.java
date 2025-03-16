package Practice_7.HashSet_tasks.Task5;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        SimpleCash cash = new SimpleCash();
        cash.addElement(3);
        cash.addElement(13);
        cash.addElement(32);
        cash.addElement(33);
        cash.addElement(34);
        cash.addElement(35);
        cash.addElement(6);

        cash.printSet();

        while (!cash.isSetEmpty()){
            cash.deleteCash();
        }

    }
}
