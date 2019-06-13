/*Написать программу, которая может находить минимальное и максимальное число из поданного ряда целых чисел.
Например: пользователь в консоли, вводит числовой ряд разделённый пробелами: 1 43 4 35 0 56 7 71 96 23.*/

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        System.out.println("Введите ряд целых чисел разделенных пробелами: ");

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] str2 = str.split(" ");

        Arrays.sort(str2);
        int len = str2.length;
            System.out.println("Минимальное число: " + str2[0]);
            System.out.println("Максимальное число: "+ str2[len-1]);
    }
}
