package algorithms;

public class CountingSort {

    //Counting Sort

    /*
    * Makes assumptions about the data
    * Doesn't use comparisons
    * Counts the number of occurrences of each value
    * Only works w/ non-negative discrete values(can't work w/ floats or strings)
    * Values must be in a specific range
    *
    * NOT an in place algorithm
    * O(n) - can achieve this because we're making assumptions about the data we're sorting
    * If we want the sort to be stable, we have to do some extra steps
     */


    //Implementation
    public static void countingSort(int[] array, int min, int max) {

        //Create array to keep track of the count
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        // j is the index we're going to use to write to the original array passed in
        int j = 0;
        // i is the index we're going to use to traverse the count array
        for(int i = min; i <= max; i++) {
            while(countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(intArray, 1, 10);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
