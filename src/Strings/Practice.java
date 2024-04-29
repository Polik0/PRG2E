package Strings;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej mozne heslo: ");
//        String password = sc.nextLine();
//        if (password.length() < 8) {
//            System.out.println("Neplatne");
//        } else {
//            System.out.println(password + " je ok");
//        }

//        System.out.println("uhadni heslo: ");
//        String legitHeslo = "secret";
//        String yoHeslo = sc.nextLine();
//        if (yoHeslo.equals(legitHeslo)) {
//            System.out.println("spravne");
//        } else{
//            System.out.println("spatne");
//        }


//        System.out.println("Zadej rodne cislo");
//        String rodneCislo = sc.nextLine();
//        if (rodneCislo.length() == 11 && rodneCislo.charAt(6) == '/') {
//            System.out.println("RC je ok");
//            if (rodneCislo.charAt(2) == '0' || rodneCislo.charAt(2) == '1') {
//                System.out.println("jedna se o muze");
//            } else if (rodneCislo.charAt(2) == '5' || rodneCislo.charAt(2) == '6') {
//                System.out.println("jedna se o zene");
//            } else {
//                System.out.println("chyba");
//            }
//        } else {
//            System.out.println("Chyba");
//        }

        // Pole stringu
//        String[] passwords = {"ananas", "vodka", "rohlik"};
//        System.out.println("Zkus uhadnout heslo: ");
//        String guess = sc.nextLine();
//        for (int i = 0; i < passwords.length; i++) {
//            if (guess.equals(passwords[i])) {
//                System.out.println("uhadl");
//                break;
//            }
//        }


        String[] names = {"Ctirad Novak", "Oldrich Stary", "Jan Malta", "Jan Karelstone"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ")) {
                System.out.println(names[i]);
            }
        }
    }
}
