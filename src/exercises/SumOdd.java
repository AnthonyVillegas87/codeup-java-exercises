package exercises;

public class SumOdd {


    public static boolean isOdd(int num) {
        if(!(num > 0)) {
            return false;
        }

        return num % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
       if(!((start <= end) || (start > 0 && end > 0))) {
           return -1;
       }

        for(int i = 0; i <= end; i++) {

            if(isOdd(i)) {

                start += i;
                System.out.println(i);
            }

        }
        return start;
    }
}
