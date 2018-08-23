package ru.zinnurov.task3;


public class multiplicationTable {
    public static void main(String[] args) {

        int[][] table = new int[10][10];

        for(int i = 1; i < table.length; i++) {
            for(int j = 1; j < table.length; j++) {
                table[i][j] = i * j;
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }

    }
}
