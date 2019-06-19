public class AnotherMassive {
    public static void main(String[] args) {

        //Создайте массив из дробных чисел (5 элементов).
        double[] arr = {1.54, 3.44004, 0.33, 2344.23_334, 555.3};

        /*Создайте 3 переменных таких типов: byte, int, long. Создайте массив типа int.
        Попытайтесь туда положить переменные.*/
        byte b=10;
        int i = 0;
        long l=1555555555;
        //int[] arr2= {i,l,b}; // compilation error



        //Создайте любой двумерный массив, заполните любыми данными и выведите в консоль
        int[][] arr3= {{11,22,33},{44,55,66}};
        for (int m=0; m<arr3.length;m++){
            for (int n=0; n<arr3[m].length; n++){
                System.out.print(arr3[m][n]+"\t");
            }
            System.out.println();
        }


    }
}
