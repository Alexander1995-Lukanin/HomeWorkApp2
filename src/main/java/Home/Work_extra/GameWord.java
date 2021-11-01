package Home.Work_extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах. apple – загаданное apricot - ответ игрока ap#############
(15 символов, чтобы пользователь не мог узнать длину слова) Для сравнения двух слов посимвольно можно пользоваться:
 String str = "apple"; char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.
 */
public class GameWord {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] cr3 = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',};
        Random rand = new Random();
        int index =  rand.nextInt(words.length);
        int i=0;
        int j=0;
        for (;;) {
            System.out.println("Введите название фрукта или овоща на английском:");
            String str1 = in.nextLine();
            if (words[index].equals(str1)) {
                System.out.println("ПОБЕДА! А вы - знаток!");
                break;
            } else  {
                char[] cr1 = words[index].toCharArray();
                char[] cr2 = str1.toCharArray();
                System.out.println("Вы проиграли! Не растраивайтесь! Пропробуйсте снова:");
                int l;
                int n=0;
                for (;j<cr2.length && i<cr1.length;){
                    if (cr1[i]==cr2[j]  ){
                        l=i;
                    cr3[l]=cr1[i];
                        j++;
                        i++;
                    }
                    else if (j<cr2.length || i<cr1.length) {
                        j++;
                        i++;
                    }
                }
                System.out.println("Даю подсказку:");
                System.out.print(Arrays.toString(cr3));
                i=0;
                j=0;
            }
            }
        }
    }





