import java.sql.SQLOutput;
import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        String[] city = new String[]{"Москва", "Амстердам", "Минск", "Курск", "Киев", "Львов", "Винница"};
        String[] used_city = city;


        //вывод приветствия
        System.out.println("Давай поиграем в ‘Города’. Ты первый называй!»");


            //ввод данных
        System.out.print("Твоё слово - ");
        Scanner sc = new Scanner(System.in);
        String input_variable = sc.nextLine();
        String input_city = input_variable.toUpperCase();

        //проверка последней буквы слова
        int last = input_city.length() - 1;
        Character ch = input_city.charAt(last);

        System.out.println("Последняя буква "+ ch);
        String str = ch.toString();

            for (int i = 0; i<used_city.length;i++) {

             if (used_city[0].charAt(1)==ch) {
                System.out.println("Моё слово - " + city[i]);
                break; }
             /*else if (){
                System.out.println("Я проиграл, ты знаешь больше городов :)");
                }*/
            }

    }
}
