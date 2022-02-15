package exercises;

public class SumOdd {


    public static boolean isOdd(int num) {
        if(!(num > 0)) {
            return false;
        }

        return num % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if ( (end < start) || (start < 0) || (end < 0) ){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++) {

            if(isOdd(i)) {

                sum += i;
                System.out.println(i);
            }

        }
        return sum;
    }
}
