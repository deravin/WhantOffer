package Practice_7.TreeMap.Task1_2;

public class Main {
    public static void main(String[] args) {
        Map userPoint = new Map();
        userPoint.addElement("Anna", 2);
        userPoint.addElement("Kate", 3);
        userPoint.addElement("Bob", 1);
        userPoint.addElement("Jane", 4);

        userPoint.printMap();
        userPoint.printMinKey();
        userPoint.printMaxKey();

    }
}
