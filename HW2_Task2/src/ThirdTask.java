/*1. Создайте строку "Hello world!"
        - Выведите первый символ
        - Выведите последний символ
        - Создайте массив символов, положите туда все символы слова world
        - Вывести массив в консоль
        - Вывести в консоль предпоследний элемент массива не используя прямой доступ по индексу (arr[3] – не сгодится)*/
public class ThirdTask {
    public static void main(String[] args) {
        String str = new String("Hello world");
        char[] strArr = str.toCharArray();
        System.out.println(strArr[0]);  //Выведите первый символ
        System.out.println(strArr[str.length()-1]); //Выведите последний символ  ИЛИ
        System.out.println(str.substring(str.length()-1)); //Выведите последний символ

        char[] world = {'w','o','r','l','d'}; //Создайте массив символов, положите туда все символы слова world
        System.out.println(world); //Вывести массив в консоль
        System.out.println(world[world.length -2]); // Вывести в консоль предпоследний элемент массива
    }
}
