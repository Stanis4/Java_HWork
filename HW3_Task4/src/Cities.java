import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        String[] city = new String[]{"Москва", "Амстердам", "Минск", "Курск", "Киев", "Львов", "Винница"};
        int array_capacity = city.length;

        //вывод приветствия
        System.out.println("Давай поиграем в ‘Города’. Ты первый называй!»");

        for (int i=0; i<array_capacity; i++){

            //ввод данных
            Scanner sc = new Scanner(System.in);
            String input_variable = sc.nextLine();
            String input_city = input_variable.toUpperCase();

            //проверка последней буквы слова
            int last = input_city.length()-1;
            char ch = input_city.charAt(last);

            if (ch==city[1][i]

        }
            System.out.println("Iteration "+i);






        //запоминаем уже взятые из массива слова



    }
}
