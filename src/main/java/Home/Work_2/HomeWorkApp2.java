package Home.Work_2;

    import org.w3c.dom.ls.LSOutput;
    import java.sql.SQLOutput;
    import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(comparisonBool(10,10));
        System.out.println (comparingNegativeOrPositiveNumbers (5));
        System.out.println (positiveOrNegativeNumbers (-5));
        System.out.println (repeatingString ("\nПовторяю",3));
        System.out.println(DefinitionOfTheYear(2200));

       }
       static boolean comparisonBool(int a,int b){
          int result =a+b;
          if (result>=10 && result<=20) {
              return true;
          }
          else return false;
      }
      public static String comparingNegativeOrPositiveNumbers (int a) {
          String pos="the number is positive";
          String neg="the number is negative";
          if (a>=0) return pos;
          else return neg;
      }
      public static boolean positiveOrNegativeNumbers (int a){
          if (a>=0) return false;
          else return true;
      }
//      public static void repeatingString (String rep,int p) { вариант повторения строки с циклом
//        for (int i=p; i>=1; i--) {
//          System.out.println(rep);
//          }
//      }
public static String repeatingString (String rep,int p) {//другой вариант повторения без цикла,но нет переноса на следующую строку
       rep = rep.repeat(p);
       return rep;
       }
       public static boolean DefinitionOfTheYear(int year) {
           return (year % 4 != 0 && year % 400 != 0 || year % 100 == 0);
       }

}





