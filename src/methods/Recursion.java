package methods;



public class Recursion {
    static void countDown(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        countDown(n-1);
    }

    static int factorial (int n) {
        if (n == 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
