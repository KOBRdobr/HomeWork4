package ru.zinnurov.task1;

import java.util.Scanner;

public class MinNum {
    public static int min(int[] num) {

        int min = num[0];

        for(int i = 0; i < num.length; i++) {
            if (min > num[i]) min = num[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] num = new int[4]; //Массив в который пользователь вводит числа
        int min; //Переменая в которую будет записано минимальное число
        int k = 0; //счетчик
        System.out.println("Введите 4 числа для поиска минимального.");

        while (k != 4) {
            if (in.hasNextInt()) {
                num[k] = in.nextInt(); //Ввод чисел
                k++;
            } else {
                in.next();
                System.out.println("Введите числа!");
                break;
            }
        }
        min = min(num); //Вызов метода в котором реализован поиск минимального числа
        System.out.println("Минимальное число: " + min);

    }
}