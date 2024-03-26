package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    static void greetings(String name) {
        System.out.println("hello, " + name);
    }

    static int rectangleArea(int width, int height) {
        return width*height;
    }

    static int random(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    static int[] randomArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(min, max);
        }
        return array;
    }

    static void timeConvert(int seconds ) {
        int hours = seconds/3600;
        int minutes = (seconds % 3600)/60;
        int remain = (seconds % 3600)%60;
        System.out.println(hours + ":" + minutes + ":" + remain);
    }


    public static void main(String[] args) {
//        greetings("Jean");
//        System.out.println("Area is: " + rectangeArea(5, 7));
//        int randomNum = random(-20, 1);
//        System.out.println(randomNum);
//        System.out.println(Arrays.toString(randomArray(10, -100, 100)));
//        timeConvert(135);
//        timeConvert(4500);
//        timeConvert(8943);


    }
}
