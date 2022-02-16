package exercises;

public class PerfectNumber {

    //A number is a perfect number if is equal to sum of its proper divisors,
    // that is, sum of its positive divisors excluding the number itself.

    public static boolean isPerfectNumber(int number) {
      if(number < 0) return false;

        int sum = 1;

        for(int i = 2; i * i <= number; i++) {
            //if a number 'i' divides into number...
            if(number % i == 0) {
                if(i * i != number) {
                    //add both 'i' & n / i to sum
                    sum = sum + i + number / i;
                } else {
                    sum = sum + i;
                }
            }
        }
        //if sum of divisors is equal to n, then it is the 'perfect number'
        if(sum == number && number != 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));

    }
}
