import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        rotate(array, 6);
        System.out.println(Arrays.toString(array));
    }

    public static void rotate(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}