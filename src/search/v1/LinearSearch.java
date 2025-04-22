package search.v1;

public class LinearSearch {
    //Time - O(n)
    public static void main(String[] args) {
        int[] array = new int[]{5, 78, 4, 2, 9, 7};
        int result = linearSearch(array, 9);
        System.out.println("Linear search result: " + result);
    }

    private static int linearSearch(int[] array, int target) {
        if (array == null)
            return -1;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}
