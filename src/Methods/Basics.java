package Methods;

public class Basics {
    //functions/methods
    static void printHello(){
        System.out.println("Hello world");
        System.out.println("Called from a method!");
    }

    static void printGreeting(String name) {
        System.out.println("Ahoj, " + name);
    }

    static int multiplication(int a, int b) {
        int result = a*b;
        return result;
    }
    public static void main(String[] args) {
        printHello();
        printGreeting("Kapr");
        System.out.println(multiplication(5, 3));
    }
}
