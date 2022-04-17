package algorithms;

import java.util.Arrays;

public class MergeSort {

    // Merge Sort (theory)

    /*
    * Divide & Conquer algorithm
    * Recursive algorithm
    * Two phases: Splitting & Merging
    * NOT an in place algorithm
    * O(n log(n)) - base 2. We're repeatedly dividing the array in half during the splitting phase - Logarithmic
    * Stable algorithm
    *
    * ======== Splitting Phase
    * Start w/ an unsorted array
    * Divide the array into two arrays, which are unsorted.
    * The first array is the left array, and the second array is the right array
    * Split the left and right arrays into two arrays each
    * Keep splitting until all the arrays have only one element each - these will become sorted arrays
    * ======================
    *
    * ======= Merging Phase
    * Merge every left/right pair of sibling arrays into a sorted array
    * After the first merge, we'll have a bunch of 2-element sorted arrays
    * Then merge those sorted arrays(left/right siblings) to end up with a bunch of 4-element sorted arrays
    * Repeat until you have a single sorted array
    * Not in-place. Uses temporary arrays
    * ======================
    *
    * Splitting phase leads to faster sorting during the merging phase
    * Splitting is logical. We don't create new arrays
     */


    //===== Implementation 1


    //Recursive call to partition the array
    public static void mergeSort(int[] array, int start, int end) {

        //base case
        if(end - start < 2) return;

        //partition the array
        int mid = (start + end) / 2;
        //merge sort on the LEFT partition first
        mergeSort(array, start, mid);
        //merge sort on the RIGHT partition first
        mergeSort(array, mid, end);

        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        //Checking in ascending order
        if(array[mid - 1] <= array[mid]) {
            return;
        }

        //Checking in descending order
//        if(array[mid - 1] >= array[mid]) {
//            return;
//        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end) {
            //Checking in ascending order
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];

            //Checking in descending order
//            temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];

        }
        //Copy any leftover elements into sorted array:
        // 1st parameter takes original array
        // 2nd parameter copy position in left array i or the first index that hasn't been handled
        // 3rd parameter is our destination (original)
        // 4th parameter is our destination index
        // 5th parameter is our length or number of elements that were not copied over from the left partition
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array,  start, tempIndex);
    }


    // implementation 2 ======================================

    public static int[] combineSortedArrays(int[] arrayOne, int[] arrayTwo) {

        int arrayOneIndex = 0;
        int arrayTwoIndex = 0;
        int mergedArrayIndex = 0;
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];

        // both arrays have some items left in them.
        while (arrayOneIndex < arrayOne.length && arrayTwoIndex < arrayTwo.length) {

            // choose the smaller of the two items and add it to the
            // merged array.
            if (arrayOne[arrayOneIndex] <= arrayTwo[arrayTwoIndex]) {
                mergedArray[mergedArrayIndex] = arrayOne[arrayOneIndex];
                arrayOneIndex += 1;
            }
            else {
                mergedArray[mergedArrayIndex] = arrayTwo[arrayTwoIndex];
                arrayTwoIndex += 1;
            }
            mergedArrayIndex += 1;
        }

        // grab any lingering items in the first array after we've
        // exhausted the second array
        while (arrayOneIndex < arrayOne.length) {
            mergedArray[mergedArrayIndex] = arrayOne[arrayOneIndex];
            mergedArrayIndex += 1;
            arrayOneIndex += 1;
        }

        // grab any lingering items in the second array after we've
        // exhausted the first array
        while (arrayTwoIndex < arrayTwo.length) {
            mergedArray[mergedArrayIndex] = arrayTwo[arrayTwoIndex];
            mergedArrayIndex += 1;
            arrayTwoIndex += 1;
        }

        return mergedArray;
    }

    public static int[] mergeSort(int[] array) {

        // base case: single element array
        if (array.length <= 1) {
            return array;
        }

        // split the input in half
        int middleIndex = array.length / 2;
        int[] left  = Arrays.copyOfRange(array, 0, middleIndex);
        int[] right = Arrays.copyOfRange(array, middleIndex, array.length);

        // sort each half
        int[] leftSorted = mergeSort(left);
        int[] rightSorted = mergeSort(right);

        // merge the sorted halves
        return combineSortedArrays(leftSorted, rightSorted);
    }



    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }



}
