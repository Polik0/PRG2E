package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        System.out.println("Zadej usernmes, zadavani ukoccis zadanin 'konec'");
        String input = sc.nextLine();
        while (!input.equals("konec")) {
            if (!usernames.contains(input)) {
                usernames.add(input);
            } else {
                System.out.println("Jmeno uz je v listu");
            }
            input = sc.nextLine();

        }
        System.out.println(usernames);


        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        int number;
        int counter = 0;
        while (uniqueNumbers.size() != 10) {
            number = (int)(Math.random()*16);
            counter++;
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println("vygenerovano cisel: " + counter);
        System.out.println(uniqueNumbers);
    }
}
