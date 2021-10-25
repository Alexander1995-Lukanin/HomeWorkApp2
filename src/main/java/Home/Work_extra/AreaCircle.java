package Home.Work_extra;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        Double radius = in.nextDouble();
        if (radius <=0) {
            System.out.println("А Вы шутник, попробуйте снова: ");
        }
        Double S= Math.PI*Math.sqrt(radius);
        System.out.println("Площадь круга: "+S);
    }
}
