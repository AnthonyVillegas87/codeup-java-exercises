package patterns.sliding_window;

public class MaxSubArray {

    // Brute force Implementation
    /*
    * Time Complexity O(n^2) Quadratic
     */
    static class MaxSumSubArrayOfSizeK {
        public static int findMaxSumSubArray(int k, int[] arr) {
            int maxSum = 0, windowSum;
            for (int i = 0; i <= arr.length - k; i++) {
                windowSum = 0;
                for (int j = i; j < i + k; j++) {
                    windowSum += arr[j];
                }
                maxSum = Math.max(maxSum, windowSum);
            }

            return maxSum;
        }

        /// My Implementation
        /*
        * Time Complexity O(n) - Linear
         */
            public static int MaxSumSubArray(int k, int[] arr) {
                int maxSum = 0;
                int tempSum = 0;
                if(arr.length < k) return -1;

                // This loop sums together the first k digits, store in variable of maxSum
                for(int i = 0; i < k; i++) {
                    maxSum += arr[i];
                }
                tempSum = maxSum;
                //Loop over the array once but start after the sum of the first 2 digits
                for(int j = k; j < arr.length; j++) {
                    tempSum = tempSum - arr[j - k] + arr[j];
                    maxSum = Math.max(maxSum, tempSum);
                }
                return maxSum;
            }

        public static int maxSumSubArray(int k, int[] arr) {
            int windowSum = 0, maxSum = 0;
            int windowStart = 0;
            for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
                windowSum += arr[windowEnd]; // add the next element
                // slide the window, we don't need to slide if we've not hit the required window size of 'k'
                if (windowEnd >= k - 1) {
                    maxSum = Math.max(maxSum, windowSum);
                    windowSum -= arr[windowStart]; // subtract the element going out
                    windowStart++; // slide the window ahead
                }
            }

            return maxSum;
        }





        public static void main(String[] args) {
            System.out.println("Maximum sum of a subarray of size K: "
                    + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
            System.out.println("Maximum sum of a subarray of size K: "
                    + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
        }
    }


}
