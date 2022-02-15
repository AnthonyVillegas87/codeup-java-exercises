package exercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int sum = 0;
        int remainder;
        int temp;


        temp = number;
        while(number > 0){
            remainder = number % 10;
            sum = (sum * 10) + remainder;
          number = number / 10;
        }
        return temp == sum;
    }


    public static void main(String[] args) {
         System.out.println(isPalindrome(-1221));
         System.out.println(isPalindrome(707));
         System.out.println(isPalindrome(11212));
    }
}
