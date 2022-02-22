package patterns.two_pointers;

public class FindMaxProfit {

    public static int calculateMaxProfit(int[] arr) {
        if(arr.length == 0) return 0;

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            } else if(profit < arr[i] - min){
                profit = arr[i] - min;
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        System.out.println(FindMaxProfit.calculateMaxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
