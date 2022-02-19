package algorithms;

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


    //===== Implementation


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
        if(array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
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

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }


}
