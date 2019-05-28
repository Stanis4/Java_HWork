/*Напишите программу, которая берет любую строку и меняет ее, сортируя слова в обратном порядке.
Например, “я хочу есть” → “есть хочу я”*/

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Введите предложение для сортировки слов в обратном порядке:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] str2 = str.split(" ");

        if (input != null) {
            for (int i = str2.length - 1; i >= 0; i--) {
                System.out.print(str2[i].toLowerCase() + ' ');
            }
        }
    }
}
