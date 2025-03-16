package Practice_2_1.Task_5;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX (int x){
        this.x = x;
    }
    public void print(){
        System.out.println("Координаты: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Point point = new Point(4,5);
        point.setX(60);
        point.print();
    }
}
