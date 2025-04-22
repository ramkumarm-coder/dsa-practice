package sorting.v2;

import java.util.Arrays;

public class InsertionSort {
    //Best - O(n) - if already sorted
    //Worst - O(n^2)
    public static void main(String[] args) {
        int[] array = new int[]{5, 78, 4, 2, 9, 7};
        int[] result = insertionSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        return array;
    }
}
