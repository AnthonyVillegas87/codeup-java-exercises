package exercises;

public class DigitSum {

    public static int sumDigits(int number) {
        int sum = 0;
        if(number < 10) {
            return -1;
        }

        while(number > 0) {
            //Extract least significant digit
            int digit = number % 10;
           sum += digit;
           //drop least significant digit
            number /= 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("Sum of digits in number 4 is " + sumDigits(5));
        System.out.println("Sum of digits in number 32123 is " + sumDigits(32123));



    }
}
