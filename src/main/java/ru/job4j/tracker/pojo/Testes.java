package ru.job4j.tracker.pojo;
import java.util.Arrays;
public class Testes {
    public static void main(String[] args) {
           /* Product first = new Product("Milk", 100);
            Product second = new Product("Milk", 100);
            boolean eq = first.equals(second);
            System.out.println(eq);
            */
       /* int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arraySource: " + Arrays.toString(arraySource));
        System.out.println("arrayDestination: "
                + Arrays.toString(arrayDestination));

        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println("arrayDestination after arrayCopy: "
                + Arrays.toString(arrayDestination));
        System.out.println();

        */
        int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destArr = new int[5];
        System.arraycopy(sourceArr, 2, destArr, 1, 4);
        for (int i = 0; i < destArr.length; i++) {
            System.out.print(destArr[i] + " ");
        }
    }
}




