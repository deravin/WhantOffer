package Practice_2.Task7_Circle;

public class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        circle1.setRadius(3);
        System.out.println("Площадь- " + circle1.calculateArea() + ", Длинна окружности - " + circle1.calculateCircumference());
    }
}
