package patterns.two_pointers;

class SortedArraySquares {

    // Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.

    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int left = 0, right = arr.length - 1;
        int highestIndex = arr.length - 1;
        while(left <= right) {
            int leftSquares = arr[left] * arr[left];
            int rightSquares = arr[right] * arr[right];

            if(leftSquares > rightSquares) {
                squares[highestIndex--] = leftSquares;
                left++;
            } else {
                squares[highestIndex--] = rightSquares;
                right--;
            }

        }

        return squares;
    }


    public static void main(String[] args) {

        int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 });
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();

        result = SortedArraySquares.makeSquares(new int[] { -3, -1, 0, 1, 2 });
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();
    }
}
