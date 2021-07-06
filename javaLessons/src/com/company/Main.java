package com.company;

import Lesson1.FirstClass;

public class Main {

    //Второй урок:
    static boolean task1(int a, int b){
        int summa = a + b;

        if(summa >= 10 && summa <= 20)
        {
            return true;
        }
        else {
            return false;
        }
    }
    static void task2(int a){
        if(a >= 0)
        {
            System.out.println("Число положительное");
        }
        else
        {
            System.out.println("Число отрицательное");
        }
    }

    public static void main(String[] args) {
        //Первый урок:

        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();

        //Второй урок:

        //Задание 1:
        //boolean result1 = task1(5, 5);
        //System.out.println(result1);

        //Задание 2:
        task2(10);
    }

    //Первый урок:
    static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = -20;

        int summa = a + b;
        if(summa >= 0)
        {
            System.out.println("Сумма положительная");
        }
        if(summa < 0)
        {
            System.out.println("Сумма отрицательная");
        }

    }

    static void printColor() {
        int value = 100;

        if(value <=0 ){
            System.out.println("Красный");
        }
        if(value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        if(value > 100){
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 10;
        int b = 20;

        if(a >= b)
        {
            System.out.println("a >= b");
        }
        else
        {
            System.out.println("a < b");
        }

    }


}
