package ru.zinnurov.task4;

import java.util.Scanner;

public class progression {
    //Расчет арифметической прогрессии
    public static double[] arithmetic(int number, int multiplier, int length) {
        double[] arithArr = new double[length];

        arithArr[0] = number;
        for (int i = 1; i < arithArr.length; i++) {
            arithArr[i] = arithArr[i - 1] + multiplier;
        }


        return arithArr;
    }

    //Расчет геометрической прогрессии
    public static double[] geometric(int number, int multiplier, int length) { //
        double[] arithArr = new double[length];

        arithArr[0] = number;
        if (multiplier > 0) {
            for (int i = 1; i < arithArr.length; i++) {
                arithArr[i] = arithArr[i - 1] * multiplier;
            }
        }
        else{
            for (int i = 1; i < arithArr.length; i++) {
                arithArr[i] = arithArr[0] * Math.pow(multiplier, (i - 1));
            }
        }


        return arithArr;
    }

    //Метод ввода
    public static int input(int i){
        Scanner in = new Scanner(System.in);
        int choice = 0;
        while (true) {
            if (in.hasNextInt()) {
                choice = in.nextInt();
                if(i == 1 && choice > 2) {
                    System.out.println("Введите число 1 или 2!");
                    continue;
                }
                break;
            } else {
                System.out.println("Введите число!");
                in.next();
            }
        }
        return  choice;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int choice = 0, number, multiplier = 1, length;
        double[] math_ptogr; //Массив в который будет записана расчитанная прогрессия

        System.out.println("Выберите прогрессию.");
        System.out.println("1. Арифметическая прогрессия.");
        System.out.println("2. Геометрическая прогрессия.");

        choice = input(1); //Выбор прогрессии

        System.out.println("Введите число с которого нужно начать.");
        number = input(2); //Выбор первого числа

        if (choice == 1) System.out.println("Введите разность прогрессии.");
        else System.out.println("Введите знаменатель прогрессии.");
        while (true) {
            multiplier = input(3);
            if(multiplier == 0) {
                System.out.println("Нужно ввести либо больше 0, либо меньше!");
                continue;
            }
            break;
        }

        System.out.println("Укажите сколько чисел вам нужно.");
        length = input(4);
        if (choice == 1) {
           math_ptogr = arithmetic(number, multiplier, length);
        }
        else  {
            math_ptogr = geometric(number, multiplier, length);
        }

        if(multiplier > 0) {
            for (int i = 0; i < length; i++) {
                System.out.print(math_ptogr[i] + " ");
            }
        }
        else {
            for (int i = length-1; i >= 0; i--) {
                System.out.print(math_ptogr[i] + " ");
            }
        }

    }


}
