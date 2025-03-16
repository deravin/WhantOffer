package Practice_7.OtherTasks.Task13;

public class Main {
    public static void main(String[] args) {
        Elements listOfElements = new Elements();
        listOfElements.addElement("String1");
        listOfElements.addElement("String2");
        listOfElements.addElement("String3");
        listOfElements.addElement("String4");
        listOfElements.addElement("String5");

        listOfElements.showElement(3);
        listOfElements.updateElement(7,"String33");
        listOfElements.showElement(3);
    }
}
