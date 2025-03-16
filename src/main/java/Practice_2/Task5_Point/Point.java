package Practice_2.Task5_Point;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }

    void setX(int x){
        this.x=x;
    }
    void print(){
        System.out.println("Координаты: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        point1.setX(3);
        point1.print();
    }
}
