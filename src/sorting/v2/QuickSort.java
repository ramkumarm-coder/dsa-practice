package sorting.v2;

import java.util.Arrays;

public class QuickSort {
    //Time - O(n log n)
    public static void main(String[] args) {
        int[] array = new int[]{5, 78, 4, 2, 9, 7};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array, int l, int r) {
        if (l < r) {
            int partitionIndex = partition(array, l, r);
            sort(array, l, partitionIndex - 1);
            sort(array, partitionIndex + 1, r);
        }
    }

    private static int partition(int[] array, int l, int r) {
        int pivot = array[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, r);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
