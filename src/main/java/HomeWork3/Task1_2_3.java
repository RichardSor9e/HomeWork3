package HomeWork3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1_2_3 {


    public static void main (String[] args){
        arrayTask1_(10);
        array100NumTask2();
        arrayTask3();
        arrayTask4(10);

    }
    public static void arrayTask1_(int b) {
        short[] shortArray = new short[b];
        for (int i = 0; i < b; i++) {
            Array.setShort(shortArray, i, (short) (Math.random() * 2));
        }
        String str = Arrays.toString(shortArray);
        System.out.println("Actual array:");
        System.out.println(str);
        for (int i = 0; i < b; i++){
            if (shortArray[i] == 0) {
                Array.setShort(shortArray, i, (short) 1);
            }else Array.setShort(shortArray, i, (short) 0);
        }
        String str2 = Arrays.toString(shortArray);
        System.out.println("Reversed array:" );
        System.out.println(str2);
    }
    private static void array100NumTask2(){
        int [] array1To100 = new int[100];
        for (int i = 1; i < 101; i++){
            Array.setInt(array1To100, i-1, i);
        }
        String str1 = Arrays.toString(array1To100);
        System.out.println();
        System.out.println("Array 1 to 100:");
        System.out.println(str1);

    }
    private static void arrayTask3(){
        byte[] arrayTask3 = new byte[] {1,5,3,2,11,4,5,2,4,8,9,1};
        int arrayLength = Array.getLength(arrayTask3);
        String arr2 = Arrays.toString(arrayTask3);
        System.out.println();
        System.out.println("The array:");
        System.out.println(arr2);

        for (byte i = 0; i < arrayLength; i++) {
            if (arrayTask3[i] < 6) {
                arrayTask3[i] = (byte) (arrayTask3[i] * 2);
            } }
            String arr1 = Arrays.toString(arrayTask3);
        System.out.println();
        System.out.println("Converted array:");
            System.out.println(arr1);
        }
    private static void arrayTask4(int i) {
        int[] [] arrayTask4 = new int [i] [i];
        for (int j = 0; j < i; j++) {
            Array.setInt(arrayTask4,i,j);
        }

    }




}
