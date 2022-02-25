package algorithms;

public class BinarySearch {

    /*
    * Data must be sorted!
    * O(logN) time
    * Chooses the element in the middle of the array and compares it against the search value
    * If the element is equal to the value, we're done
    * If element is greater than the value, search the left half of the array
    * If the element is less than the value, search the right half of the array
     */

//=============== Iterative version
    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while(start < end) {
            int midPoint = (start + end) / 2;
            System.out.println("midpoint = " + midPoint);

            if(input[midPoint] == value) {
                return midPoint;
            } else if(input[midPoint] < value) {
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }
        return -1;
    }

//============== Recursive version
    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if(start >= end) {
            return -1;
        }

        int midPoint = (start + end) / 2;
        System.out.println("midpoint = " + midPoint);

        if(input[midPoint] == value) {
            return midPoint;
        } else if(input[midPoint] < value) {
            return recursiveBinarySearch(input, midPoint + 1, end, value);
        } else {
           return recursiveBinarySearch(input, start, midPoint, value);
        }

    }

    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

//        System.out.println(binarySearch(intArray, -15));
//        System.out.println(binarySearch(intArray, 35));
//        System.out.println(binarySearch(intArray, 8888));
//        System.out.println(binarySearch(intArray, 20));
//        System.out.println(binarySearch(intArray, 55));



        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 20));
        System.out.println(recursiveBinarySearch(intArray, 55));
    }
}
