package Home.Work_extra;

import org.w3c.dom.ls.LSOutput;
import javax.sound.sampled.Line;
import java.util.Scanner;

public class CipherCaesar {
    public static void main(String[] args) {
        System.out.println("Введите текст для шифрования");
        Scanner in=new Scanner(System.in);
        int z=3;
        StringBuilder result = new StringBuilder();
        for (char character : in.nextLine().toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'а';
                int newAlphabetPosition = (originalAlphabetPosition + z) % 33;
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        System.out.println(result);

        System.out.println("Введите текст для дешифрования");
        Scanner ind=new Scanner(System.in);
        StringBuilder result_d = new StringBuilder(); // создаем объект класса StringBuilder
        for (char character : ind.nextLine().toCharArray()) { //Переводим со сканера строку в массив знаков
            if (character != ' ') { //исключаем пробелы
                int originalAlphabetPosition = character - 'а';
                int newAlphabetPosition = (originalAlphabetPosition - z) % 33;
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result_d.append(newCharacter);
            } else {
                result_d.append(character);
            }
        }
        System.out.println(result_d);
    }

}
