package exercises;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) return -1;

        int first = 0;
        int last = 0;

        last = number % 10;
        while(number != 0) {
        first = number % 10;


            number = number / 10;
        }

        return first + last;

    }

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
