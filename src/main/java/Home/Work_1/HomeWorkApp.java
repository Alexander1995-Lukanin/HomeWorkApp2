package Home.Work_1;

import javax.swing.*;

public class HomeWorkApp {
    public static void main(String[] args) {
       printThreWordse();//вызов метода вывода в консоль строк Orange Banana Apple.
        chekSumSign();//вызов метода сравнения сравнения сумм а и b.
        printColor();//вызов метода сравнения переменной value.
        compareNumbers();//вызов метода сравнения значений a и b.
    }
    public static void printThreWordse() {
        System.out.println("Задание №2");
        System.out.println("Orange");
        System.out.println ("Banana");
        System.out.println  ("Apple");
    }
    public static void chekSumSign(){
        System.out.println("Задание №3");
        int a=2;
        int b=4;
        int c=a+b;
        if(c>=0){
            System.out.println("Сумма положительна");
        }
            else System.out.println("Сумма отрицательна");
    }
    public static void printColor() {
        System.out.println("Задание №4");
        int value;
        value = 145;
        if (value <= 0) System.out.println("Красный");
        if (value > 0 && value <= 100) System.out.println("Желтый");
        if (value > 100) System.out.println("Зеленый");
    }
    private static void compareNumbers(){
        System.out.println("Задание №5");
        int a= 40;
        int b = 20;
        if(a>=b) {
            System.out.println("a >= b");
        }
        else  System.out.println("a < b");
    }
}
