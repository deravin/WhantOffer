package Practice_2_1.Task_7;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.setRadius(5);
        System.out.println("Площадь: " + circle.calculateArea() + ". Длинна окружности: " + circle.calculateCircumference());
    }
}
