package ru.zinnurov.task2;

import java.util.Scanner;

public class WhatNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Введите число");
        while (true) {
            if (in.hasNextInt()) {
                number = in.nextInt();
                break;

            } else {
                System.out.println("ВВедите целое число!");
                in.next();
            }
        }
        if(number < 0 && (number % 2 == 0)) System.out.println("Четное отрицательное число");
        else if (number < 0 && (number % 2 != 0)) System.out.println("Не четное отрицательное число");
        else if (number == 0) System.out.println("Нулевое число");
        else if (number > 0 && (number % 2 == 0)) System.out.println("Четное положительное число");
        else if (number > 0 && (number % 2 != 0)) System.out.println("Нечетное положительное число");
    }
}
