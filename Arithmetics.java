public class Arithmetics {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("Сумма:" + (x+y));
        System.out.println(x + "" + y);


        System.out.println("Четные числа:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}