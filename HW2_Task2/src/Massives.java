//Создайте массив из целых чисел и поместите сразу 10 значений. Пройдитесь по ним и поменяйте значения.
public class Massives {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr.toString());
        for (int i: arr
             ) {
            arr[0]=10;
            arr[5]=8;
            arr[9]=100;
            System.out.print(i+" ");
        }
    }
}
