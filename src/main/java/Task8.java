import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Task8 {


    public static void main(String[] args) {
        shiftArray(new int[] {1,2,3,4,5,6,7}, 5);


    }
    private static void shiftArray (int [] arr, int numN) {
        int shiftNumb = numN % arr.length;
        System.out.println(shiftNumb);
        if (shiftNumb < 0) {
            shiftLeft(arr, shiftNumb);
        } else shiftRight(arr, shiftNumb);
        System.out.println(Arrays.toString(arr));}

    private static void shiftLeft (int [] arrLeft, int n){
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = arrLeft[0];
            for (int j = 0; j < arrLeft.length - 1; j++) {
                arrLeft[j] = arrLeft[j + 1];
            }arrLeft[arrLeft.length - 1] = firstValue;
        }
    }

    public static void shiftRight(int[] arrRight, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = arrRight[arrRight.length - 1];
            for (int j = arrRight.length - 1; j > 0; j--) {
                arrRight[j] = arrRight[j - 1];
            } arrRight[0] =lastValue;

        }

    }


}
