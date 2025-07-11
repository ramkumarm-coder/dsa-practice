package sorting.v2;

import java.util.Arrays;

public class MergeSort {
    //Time - O(n log n)
    public static void main(String[] args) {
        int[] array = new int[]{5, 78, 4, 2, 9, 7};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }

    private static void merge(int[] array, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copy array
        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = array[m + 1 + i];
        }

        //Sort
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                array[k++] = L[i++];
            else
                array[k++] = R[j++];
        }

        //Copy remain
        while (i < n1)
            array[k++] = L[i++];

        while (j < n2)
            array[k++] = R[j++];
    }
}
