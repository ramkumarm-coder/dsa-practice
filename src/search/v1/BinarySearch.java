package search.v1;

public class BinarySearch {
    //Only for sorted array
    //divide and search
    //Time O(log n)
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 7, 9, 78};
        int res = binarySearch(array, 78);
        System.out.println("Binary search result: " + res);
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int m = (low + high) / 2;

            if (array[m] == target)
                return m;

            if (array[m] < target)
                low = m + 1;
            else
                high = m - 1;
        }
        return -1;
    }
}
