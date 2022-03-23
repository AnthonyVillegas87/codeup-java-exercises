package arrays;
import java.util.*;

public class ArrayRotation {
    // We're given an array of integers, nums. Rotate the array by n elements, where n is an integer:
    /*
    * For positive values of n, perform a right rotation.
    * For negative values of n, perform a left rotation.
     */


   /*
   *  Normalize the rotations, so they do not exceed the length of the array.
   *  For example, for an array of length 10, rotating by 14 elements is the same as rotating by (14%10) 4 elements.
   * Convert negative rotations to positive rotations
   * Reverse the elements of the original array.
   * Reverse the elements from 0 to n-1.
   * Reverse the elements from n to length-1.
    */

    static void reverseArray(List<Integer> nums, int start, int end) {
        while(start < end) {
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            ++start;
            --end;
        }
    }

    static void rotateArray(List<Integer> nums, int n) {
        int len = nums.size();

        // Normalizing the 'n' rotations
        n = n % len;
        if(n < 0) {
            n = n + len;
        }

        // Partition the nums array based on rotations 'n'
        reverseArray(nums, 0, len - 1);
        reverseArray(nums, 0, n - 1);
        reverseArray(nums, n, len - 1);
    }


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 10, 20, 0, 59, 86, 32, 11, 9, 40);
        System.out.println("Array Before Rotation\n" + nums);
        rotateArray(nums, 2);
        System.out.println("Array After 2 Rotations\n" + nums);
    }

}
