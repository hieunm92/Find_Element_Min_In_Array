import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(10);
        System.out.println("Nhap do dai mang: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10)+1;
            System.out.println(array[i]);
        }

        int index = minValue(array);
        System.out.println("Phan tu nho nhat trong mang: " + index);
    }

    public static int minValue(int[] array) {
        int minValue = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < minValue) {
                  minValue = array[j] ;
            }
        }return minValue;
    }
}


