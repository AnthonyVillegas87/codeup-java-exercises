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

        // edge case
        //we check if the size of the array is less than or equal to zero. If it is, we return -1.
        if(input.length <= 0) return -1;
        // If the array only has one element, we check if it is equal to s. If it is, we return 0. Otherwise, we return -1.
        if(input.length == 1) {
            if(input[0] == value)
                return 0;
                     else
                    return -1;

        }

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

        // if the element we are  searching for isnt in the array, return -1
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


    //============= modified Binary Search

    // O(log(N))
        static int searchRotatedArray(int arr[], int left, int right, int n) {
            int mid = (left + right) / 2;

            if (n == arr[mid]) // Element Found
                return mid;

            if (right < left)
                return -1;



            if (arr[left] < arr[mid]) { // The left half of the array is sorted

                if (n >= arr[left] && n < arr[mid]) // If s is between the mid and start values
                    return searchRotatedArray(arr, left, mid - 1, n); // Search in the left half
                else
                    return searchRotatedArray(arr, mid + 1, right, n);  // Search in the right half

            } else if (arr[mid] < arr[right]) { // The right half of the array is sorted

                if (n > arr[mid] && n <= arr[right]) // If s is between the mid and end values
                    return searchRotatedArray(arr, mid + 1, right, n); // Search right
                else
                    return searchRotatedArray(arr, left, mid - 1, n); // Search left

            } else if (arr[left] == arr[mid]) { // If the left is all repeats

                if (arr[mid] != arr[right]) // If the right element is not a repeat
                    return searchRotatedArray(arr, mid + 1, right, n); // search in the right half
                else { // Otherwise, search both halves

                    int result = searchRotatedArray(arr, left, mid - 1, n); // Search in left
                    if (result == -1)
                        return searchRotatedArray(arr, mid + 1, right, n); // Search in right
                    else
                        return result;
                }
            }
            return -1;
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
