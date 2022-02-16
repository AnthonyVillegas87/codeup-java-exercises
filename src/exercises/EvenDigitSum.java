package exercises;

public class EvenDigitSum {

    public static boolean isEven(int num) {
        if(!(num > 0)) {
            return false;
        }
        return num % 2 == 0;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int digit;
        if(number < 0) return -1;


        while(number != 0) {
           digit = number % 10;
          if(isEven(digit)) {
              sum += digit;

          }
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {


        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
    }
}
