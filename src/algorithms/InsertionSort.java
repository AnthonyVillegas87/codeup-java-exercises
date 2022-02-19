package algorithms;

import java.util.Arrays;

public class InsertionSort {

    //Insertion Sort (theory)

    /*
    * In place algorithm
    * 0(n^2) time complexity - Quadratic
    * It will take 100 steps to sort 10 items/ 10,000 steps to sort 100 items/ 1,000,000 steps to sort 1,000 items
    * Stable Algorithm
     */

    public static int[] insertionSort(int[] array) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            //Save the value we're going to insert here
            int newElement = array[firstUnsortedIndex];
            //Declare i outside the loop because we'll need it after the loop
            int i;
            //loop for the traversal of the sorted partition & looks for the correct position to insert our newElemet
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(InsertionSort.insertionSort(intArray)));
    }

}
