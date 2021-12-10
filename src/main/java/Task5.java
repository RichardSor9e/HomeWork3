import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5 {
    public static final int len = 10;
    public static final int initialValue = 5;

    public static void main(String[] args) {
        int [] reternedArray = methodTask5(len, initialValue);
        String str1 = new String(Arrays.toString(reternedArray));
        System.out.println(str1);

    }

    private static int[] methodTask5(int len, int initialValue) {
        int [] arrayTask5 = new int [len];
        for (int i = 0; i < len; i++) {
            Array.setInt(arrayTask5, i, initialValue);
        }
        return arrayTask5;


    }
}
