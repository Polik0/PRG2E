package Strings;

public class Building {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        builder.insert(2, "SECRET");
        System.out.println(builder);

        builder.append(" World");
        System.out.println(builder);
    }
}