package algorithms;

import java.util.Arrays;

public class ShellSort {

    // Shell Sort (theory)

    /*
    *   Variation of Insertion Sort ...
    *   Insertion Sort chooses which element to insert using a gap of 1
    *   Shell Sort starts out using a larger gap value
    *   As the algorithm runs, the gap is reduced
    *   The goal is to reduce the amount of shifting required
    *   The last gap value is equivalent to insertion sort
    *   So, the algorithm does some preliminary work (using gap values greater than 1), and then becomes insertion sort
    *   By the time we get to insertion sort, the array has been partially sorted, so there's less shifting required
    *
    *
    * In place Algorithm
    * Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n^2), but it can perform much better
    * Doesn't require as much shifting as Insertion Sort, so it usually performs better
    * Unstable Algorithm
     */

    // Implementation 1 ======= Knuth Sequence
    /*
    * Gap is calculated using (3^k - 1) / 2
    * We set k based on the length of the array
    * We want the gap to be as close as possible to the length of the array we want to sort, w/o being greater than the length
     */





    //Implementation 2
    public static int[] shellSort(int[] array) {
        //First loop is to initialize a gap value then reduce it
        for(int gap = array.length / 2; gap > 0; gap /= 2) {

            //Utilize Insertion Sort once the gap is narrowed to 1
            for(int i = gap; i < array.length; i++) {
                int newElement = array[i];

                //Use j to traverse
                int j = i;
                //Once j becomes less (<) than the gap, we've hit the front of the array && index at j is greater than the element, we want to shift
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    //Narrow the gap or Subtract from j
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(ShellSort.shellSort(intArray)));


    }
}
