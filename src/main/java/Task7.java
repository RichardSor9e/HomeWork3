import java.util.Arrays;

public class Task7 {

    public static final int ARRAY_LENGHT = 15;
    public static final int ARRAY_RANGE = 3;


    public static void main(String[] args) {
        findMaxAndMin();
    }


    private static void findMaxAndMin() {
        boolean result = false;
        int[] arr = new int[ARRAY_LENGHT];
        for (int i = 0; i < ARRAY_LENGHT; i++) {
            arr[i] = ((int) (Math.random() * ARRAY_RANGE));
        }
        System.out.println("The array");
        String str = new String(Arrays.toString(arr));
        System.out.println(str);

        for (int i = 0; i <= ARRAY_LENGHT-1; i++) {

            int numX = 0;
            int numY = 0;

            for (int j = 0; j <= i; j++) {
                numX += arr[j];

            }
            for (int j = ARRAY_LENGHT-1; j > i; j--) {
                numY += arr[j];
            }

            if (numX == numY) {
                result = true;
                break;
            }
        }
        System.out.println("Result: " +result);

    }
}
