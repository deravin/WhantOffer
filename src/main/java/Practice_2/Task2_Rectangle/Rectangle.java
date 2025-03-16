package Practice_2.Task2_Rectangle;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }

    void setWidth(int width){
        this.width=width;
    }

    int calculateArea(){
        return width*height;
    }


}
