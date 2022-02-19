package algorithms;

import java.util.Arrays;

public class SelectionSort {
    // Selection Sort (theory)
    /*
    * In place Algorithm
    * O(n^2) time complexity - Quadratic
    * It will take 100 steps to sort 10 items/ 10,000 steps to sort 100 items/ 1,000,000 steps to sort 1,000 items
    * Doesn't require as much swapping as Bubble Sort
    * Unstable Algorithm
     */


    //Selection Sort (implementation)
    public static void swap(int[] array, int i, int j) {
        //check if i = j, if so there's nothing for us to do
        if(i == j) return;

        //if i isn't equal to j create a temporary variable, assign i to it; What ws at position j will now be at position i
        int temp = array[i];
        //assign what's at j to i
        array[i] = array[j];
        //assign the new temp
        array[j] = temp;
    }

    public static int[] selectionSort(int[] array) {

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            // init largest element at 0
            int largestInt = 0;

            // Init i at index 1 to compare our to largestInt instance which is initialized at 0 : equals (in 2nd for loop) signifies to compare to our largest element opposite of Bubble Sort
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largestInt]) {
                    largestInt = i;
                }
            }
            swap(array, largestInt, lastUnsortedIndex);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(SelectionSort.selectionSort(intArray)));
    }

}
