package oop;

public class RectanglePractice {
    public static void main(String[] args) {
        Rectangle abcd = new Rectangle();
        abcd.width = 4;
        abcd.height = 10;
        System.out.println("obdelnik w: " + abcd.width + ", obdelnik h: " + abcd.height);
        System.out.println("Obsah: " + abcd.getArea());
        System.out.println("Je to ctverec?: " + abcd.isSquare());
    }
}
