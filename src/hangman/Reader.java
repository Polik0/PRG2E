package hangman;

import java.util.Scanner;

public class Reader {
    Scanner sc;

    public Reader() {
        sc = new Scanner(System.in);
    }

    /**
     * precte prave jeden znak
     */
    String readInput(){
        System.out.println("Zadej volbu (1 pismeno):");
        String input = sc.nextLine();
        while (input.length() != 1){
            System.out.println("Zadej pouze jedno pismeno!");
            input = sc.nextLine();
        }

        return input;
    }
}