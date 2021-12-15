package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static final int arrowLeght = 10;
    public static final int arrowRange = 20;

    public static void main(String[] args) {

        findMaxAndMin(arrowLeght);
    }
    private static void findMaxAndMin (int a){
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = ((int) (Math.random() * arrowRange));
        }
            String str = new String(Arrays.toString(arr));
            System.out.println(str);

            int max = 0;
        for (int i = 0; i < a; i++) {
            max = Math.max(arr[i], max);

        }            System.out.println("Maximum num: " + max);
        int min = arrowRange;
        for (int i = 0; i < a; i++) {
            min = Math.min(arr[i], min);

        }            System.out.println("Minimum num: " + min);

    }



    }
