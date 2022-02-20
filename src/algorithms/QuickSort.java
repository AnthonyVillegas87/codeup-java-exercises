package algorithms;

import java.util.Arrays;

public class QuickSort {

    //Quick Sort

    /*
    * Divide and Conquer algorithm
    * Recursive algorithm
    * Uses a pivot element to partition the array into 2 parts
    * Elements < pivot to it's left, elements > pivot to its right
    * Pivot will then be in its correct sorted position
    * In place algorithm
    * O(nlog(n)) - base 2 - Log-linear; We're repeatedly partitioning the array into two halves;
    * unstable algorithm
     */

    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length);
        return array;
    }

    public static void quickSort(int[] array, int start, int end) {
        if(end - start < 2) return;


            //Returns the starting position element in the array
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex);
            quickSort(array, pivotIndex + 1, end);

    }

    public static int partition(int[] array, int start, int end) {
        //This is using the first element as the pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        while(i < j) {

            //NOTE: empty loop body
            //using the prefix increment/decrement operators.
            while(i < j && array[--j] >= pivot) ;
               if(i < j) {
                   array[i] = array[j];
               }

               while(i < j && array[++i] <= pivot);
                   if(i < j) {
                       array[j] = array[i];
                   }
            }
        array[j] = pivot;
        return j;
    }



    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
       quickSort(intArray);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
