package oop;

public class Rectangle {
    int width;
    int height;

    public int getArea () {
        return width*height;
    }
    public boolean isSquare () {
        return height==width;
    }
}
