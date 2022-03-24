package arrays;

import java.util.Arrays;

public class SearchRotatedArray {
        /*
        * Search for a given number in a sorted array that has been rotated by some arbitrary number
         */
    /*
    * We're given a sorted integer array, nums and an integer value, target.
    * The array is rotated by some arbitrary number.
    * Search the target in this array.
    * If the target does not exist then return -1
     */

    static int binarySearchRotated(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // edge case
        if (left > right) return -1;

        while(left <= right) {
            int midPoint = (left + right) / 2;
            //If target value is present at the middle of array
            if(nums[midPoint] == target) {
                return midPoint;
            }

            // left to middle is sorted
            if(nums[left] <= nums[midPoint]) {
                if(nums[left] <= target && target < nums[midPoint]) {
                    right = midPoint - 1;
                } else {
                    left = midPoint + 1;
                }

            } else {
                if(nums[midPoint] < target && target <= nums[right]) {
                    left = midPoint + 1;
                } else {
                    right = midPoint - 1;
                }
            }
        }

        return -1;
    }

    //TIME COMPLEXITY: O(LOG N) LOGARITHMIC
    //SPACE COMPLEXITY: O(1) CONSTANT

    public static void main(String[] args) {
        int[] targetList = {3, 6, 3, 6};
        int[][] numsList = {{6, 7, 1, 2, 3, 4, 5}, {6, 7, 1, 2, 3, 4, 5}, {4, 5, 6, 1, 2, 3},
                {4, 5, 6, 1, 2, 3}};

        for (int i = 0; i < targetList.length; i++) {
            System.out.println((i + 1) + ". Rotated array: " + Arrays.toString(numsList[i]));
            System.out.println("   target " + targetList[i] + " found at index "
                    + binarySearchRotated(numsList[i], targetList[i]));
            System.out.println(
                    "----------------------------------------------------------------------------------------------------\n");
        }
    }
}
