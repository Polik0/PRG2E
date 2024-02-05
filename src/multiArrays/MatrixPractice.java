package multiArrays;

import javax.swing.*;

public class MatrixPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*90+10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Printing row_");
        String input = JOptionPane.showInputDialog("Zadej cislo radku");
        int row = Integer.parseInt(input);
        for (int i = 0; i < matrix[row].length; i++) {
            System.out.print(matrix[row][i] + " ");
        }
        System.out.println();

        System.out.println("Printing column_");
        input = JOptionPane.showInputDialog("Zadej cislo sloupce");
        int col = Integer.parseInt(input);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][col]);
        }
        System.out.println();

        int sumPartial = 0;
        int sumTotal = 0;

        for (int i = 0; i < matrix.length; i++) {
            sumPartial = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumTotal += matrix[i][j];
                sumPartial += matrix[i][j];
            }
            System.out.println("Average of arr#" + i + ": " + (sumPartial/ matrix[i].length));
        }
        System.out.println("Total average = "  + (sumTotal/ (matrix.length* matrix.length)));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
