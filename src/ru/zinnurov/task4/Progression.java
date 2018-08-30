package ru.zinnurov.task4;

import java.util.Scanner;

public class Progression {
    //Расчет арифметической прогрессии
    public static double[] arithmetic() {

        int number, multiplier, length;
        double[] arithArr;
        System.out.println("Введите число с которого нужно начать.");
        number = input(); //Выбор первого числа

        System.out.println("Введите разность прогрессии.");
        while (true) {
            multiplier = input();
            if(multiplier == 0) {
                System.out.println("Нужно ввести либо больше 0, либо меньше!");
                continue;
            }
            break;
        }
        System.out.println("Укажите сколько чисел вам нужно.");
        length = input();

        arithArr = new double[length];
        arithArr[0] = number;
        for (int i = 1; i < arithArr.length; i++) {
            arithArr[i] = arithArr[i - 1] + multiplier;
        }
        return arithArr;
    }

    //Расчет геометрической прогрессии
    public static double[] geometric() { //
        int number, multiplier, length;
        double[] arithArr;

        System.out.println("Введите число с которого нужно начать.");
        number = input(); //Выбор первого числа

        System.out.println("Введите знаменатель прогрессии.");
        while (true) {
            multiplier = input();
            if(multiplier == 0) {
                System.out.println("Нужно ввести либо больше 0, либо меньше!");
                continue;
            }
            break;
        }
        System.out.println("Укажите сколько чисел вам нужно.");
        length = input();

        arithArr = new double[length];
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

    //Метод вывода прогрессии
    private static void outputProg(double[] progression) {

        for (int i = 0; i < progression.length; i++) {
            System.out.print(progression[i] + " ");
        }
    }

    //Метод ввода
    public static int input(){
        Scanner in = new Scanner(System.in);
        int choice = 0;
        while (true) {
            if (in.hasNextInt()) {
                choice = in.nextInt();
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

        int choice;
        double[] progression;

        System.out.println("Выберите прогрессию.");
        System.out.println("1. Арифметическая прогрессия.");
        System.out.println("2. Геометрическая прогрессия.");

        while(true) {
            choice = input(); //Выбор прогрессии
            if(choice > 2 | choice < 0) {
                System.out.println("Введите число от 1 до 2!");
                continue;
            }
            break;
        }

        if(choice == 1) progression = arithmetic();
        else progression = geometric();

        outputProg(progression);



    }


}
