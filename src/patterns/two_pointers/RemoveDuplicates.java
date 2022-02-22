package patterns.two_pointers;

public class RemoveDuplicates {

    /*
    Given an array of sorted numbers, remove all duplicates from it.
    You should not use any extra space; after removing the duplicates in-place return the length of the subarray that has no duplicate in it.

    In this problem, we need to remove the duplicates in-place such that the resultant length of the array remains sorted.
     As the input array is sorted, therefore, one way to do this is to shift the elements left whenever we encounter duplicates.
     In other words, we will keep one pointer for iterating the array and one pointer for placing the next non-duplicate number.
     So our algorithm will be to iterate the array and whenever we see a non-duplicate number we move it next to the last non-duplicate number we’ve seen.

    O(N)
     */




        public static int remove(int[] arr) {
            int nextNonDuplicate = 1; // index of the next non-duplicate element
            for (int i = 0; i < arr.length; i++) {
                if (arr[nextNonDuplicate - 1] != arr[i]) {
                    arr[nextNonDuplicate] = arr[i];
                    nextNonDuplicate++;
                }
            }

            return nextNonDuplicate;
        }

        // #2

    /*
    Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.
     */

    public static int removeElement(int[] arr, int key) {
        int nextElement = 0; // index of the next element which is not 'key'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[nextElement] = arr[i];
                nextElement++;
            }
        }

        return nextElement;
    }


    public static void main(String[] args) {
            int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
            System.out.println(RemoveDuplicates.remove(arr));

            arr = new int[] { 2, 2, 2, 11 };
            System.out.println(RemoveDuplicates.remove(arr));

        int[] array = new int[] { 3, 2, 3, 6, 3, 10, 9, 3 };
        System.out.println(RemoveDuplicates.removeElement(arr, 3));

        array = new int[] { 2, 11, 2, 2, 1 };
        System.out.println(RemoveDuplicates.removeElement(arr, 2));
        }


}
