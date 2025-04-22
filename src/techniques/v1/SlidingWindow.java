package techniques.v1;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        //Find maximum sum of sub-array with size of k
        //Time - O(n)
        int maxSum = maximumSumOfSubArray(array, k);
        System.out.println("Max Sum: " + maxSum);

        //Find longest substring without non-repeat chars
        int length = findLongestSubStringLength("ramkumar");
        System.out.println("Longest non-repeat chars count: " + length);
    }

    private static int findLongestSubStringLength(String str) {
        int left = 0, maxLength = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            while (set.contains(str.charAt(i))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }

    static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    private static int maximumSumOfSubArray(int[] array, int k) {
        //First window
        int windowSum = 0, maxSum;
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }
        maxSum = windowSum;

        for (int i = k; i < array.length; i++) {
            windowSum += array[i] - array[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
