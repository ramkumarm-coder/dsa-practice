package sorting.v2;

import java.util.Arrays;

public class SelectionSort {
    //Time - O(n^2)
    public static void main(String[] args) {
        int[] array = new int[]{5, 78, 4, 2, 9, 7};
        int[] result = selectionSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
