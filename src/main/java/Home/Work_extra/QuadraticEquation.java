package Home.Work_extra;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a,b,c,D,x1,x2;
        Scanner in=new Scanner(System.in);
        System.out.println("Программа решает квадратное уравнение такого вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        if (a==0){
            System.out.println("Введеное уравнение не квадратное! Не шути так со мной!");
        }
        D=b*b-4*a*c;
        int x=5;

        if (D>0){
            x1=(-b-Math.sqrt(D))/(2*a);
            x2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("Корни уравнения "+"  X1="+x1+"  X2="+x2);
        }
        else if (D==0){
            x1=-b/(2*a);
            System.out.println("Уравнение имеет едиственный корень "+" X="+x1);
        }
        else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
