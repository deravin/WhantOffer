package Practice_2_1.Task_2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int calculateArea(){
        return width*height;
    }
}
