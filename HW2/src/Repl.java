/*Создайте строку “Я хочу переносы строк.”
Замените все символы пробела в строке, на символы переноса строк и выведите в консоль.*/
public class Repl {
    public static void main(String[] args) {
    String str = new String("Я хочу переносы строк");
        System.out.println(str.replace(" ", "\n"));

    }
}
