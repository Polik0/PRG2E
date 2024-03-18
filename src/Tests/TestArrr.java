package Tests;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrr {
    public static void main(String[] args) {
        //1
        int res = 0;
        int counter = 0;
        int[][] marks = {
                {50, 60, 80},
                {56, 27, 11},
                {33, 35, 65},
                {36, 32, 56}
        };


        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                res += marks[i][j];
            }
            if (res >= 100) {
                System.out.println("Zak " + " " + "  " + (i+1) + " prosel");
                counter++;
            } else {
                System.out.println("Zak " + " "+ " " + (i+1) + " neprosel");
            }
            res = 0;
        }
        System.out.println("Proslo " + counter + " zaku");

    //2
        int max = 0;
        int[][] pole1 = {
                {50, 60, 80, 2},
                {56, 27, 11, 100},
                {33, 35, 65, 102},
                {36, 32, 561, 12}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo radku: ");
        int input = sc.nextInt() - 1;
        for (int i = 0; i < pole1[input].length; i++) {
            if (pole1[input][i] > max) {
                max = pole1[input][i];
            }
        }
        System.out.println("max: " + max);

    //3

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Zadej heslo, ukoncis 'konec': ");
        String inputr = sc.nextLine();
        while (inputr != "konec") {
            list.add(inputr);
            inputr = sc.nextLine();
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= 8 && list.get(i).contains("*")) {
                System.out.println(list.get(i) + ", ");
            }
        }
    }
}
