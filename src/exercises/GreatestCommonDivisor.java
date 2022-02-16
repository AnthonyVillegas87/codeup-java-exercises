package exercises;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if((first < 10) || (second < 10)) {
            return -1;
        }

        int tempValue;
        int gcd = 0;

        while(second != 0) {
           tempValue = second;
           second = first % second;
           first = tempValue;
            gcd = first;
        }

        return gcd;
    }

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));


    }
}
