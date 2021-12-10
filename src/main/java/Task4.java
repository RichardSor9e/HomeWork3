import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    private static final int one = 1;
    public static final int arraysLenght = 10;
    public static final int arraysHeight = 10;
    private static int[][] arrayTask = new int[arraysLenght][arraysHeight];


    public static void main(String[] args) {
        arrayTask4(arraysLenght, arraysHeight);
        printArray(arraysLenght, arraysHeight);

    }

    private static void arrayTask4(int i, int j) {
        for (int k = 0; k < i; k++) {
            for (int p = 0; p < j; p++) {
                if (k == p) arrayTask[k][p] = one;
            }
        }
    }

    private static void printNumber(int i) {
        System.out.print(i + 1 + "  ");
    }

    private static void printArray(int b, int c) {
        for (int i = 0; i < b; i++) {
            printNumber(i);
            for (int j = 0; j < c; j++) {
                System.out.print(arrayTask[i][j] + "  ");
            }
            System.out.println();
        }
    }
}




