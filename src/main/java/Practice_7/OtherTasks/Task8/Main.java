package Practice_7.OtherTasks.Task8;

public class Main {
    public static void main(String[] args) {
        Visitors visitors = new Visitors();
        visitors.addVisitor("Visitor1");
        visitors.addVisitor("Visitor2");
        visitors.addVisitor("Visitor3");
        visitors.addVisitor("Visitor4");
        visitors.addVisitor("Visitor2");
        visitors.addVisitor("Visitor1");

        System.out.println(visitors.showNumbersOfVisitors());
    }
}
