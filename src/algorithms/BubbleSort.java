package algorithms;

import java.util.Arrays;

public class BubbleSort {
    //==== Bubble Sort (Theory)

    /*
    * In place Algorithm (when it comes to memory if the extra memory you need doesn't depend on the number of items being sorted)
    * O(n^2) time complexity - Quadratic
    * If array is in sorted order O(n) - Linear
    * O(1) Space Complexity
    * It will take 100 steps to sort 10 items/ 10,000 steps to sort 100 items/ 1,000,000 steps to sort 1,000 items
    * Algorithm performance degrades quickly
     */

/// ======= SORTED INTEGER ARRAY RETURN VALUE (Implementation)
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

    public static int[] bubbleSort(int[] array) {
        //If array is empty return an empty array
        if(array.length == 0) {
            return new int[] {};
        }
        //The index will go from 6 to 0 & once we hit 0 we stop. At that point the entire array has been sorted. Thats the outer loop
        //SORTING IN ASCENDING ORDER & BUBBLING LARGE VALUES TO THE END OF THE ARRAY & GROWING A SORTED PARTITION FROM RIGHT TO LEFT
        //AFTER EACH ITERATION OF THE OUTER LOOP THE SORTED PARTITION GROWS BY 1
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }

        return array;
    }




    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(bubbleSort(intArray)));


//        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
//            for(int i = 0; i < lastUnsortedIndex; i++) {
//                if(intArray[i] > intArray[i + 1]) {
//                    swap(intArray, i, i + 1);
//                }
//            }
//        }

        //PRINT ARRAY AFTER IT'S BEEN SORTED
//        for(int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
    }




}
