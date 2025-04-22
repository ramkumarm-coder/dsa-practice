package sorting.v2;

import java.util.Arrays;

public class BubbleSort {
    //Time Complexity O(n^2)
    public static void main(String[] args) {
        int[] array = new int[]{5, 78, 4, 2, 9, 7};
        int[] result = bubbleSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
