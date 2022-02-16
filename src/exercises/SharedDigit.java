package exercises;

public class SharedDigit {

    public static boolean sharedDigit(int num1, int num2) {
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int firstLastDigit = num1 % 10;
        int secondLastDigit = num2 % 10;
         while(true) {

             firstLastDigit /= 10;
             secondLastDigit /= 10;

             int firstNumberFirstDigit = firstLastDigit;
             int secondNumberFirstDigit = secondLastDigit;
             return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondLastDigit) || (firstLastDigit == secondNumberFirstDigit) || (firstLastDigit == secondLastDigit));

         }


    }

    public static void main(String[] args) {
        System.out.println(sharedDigit(12, 23));
        System.out.println(sharedDigit(9, 99));
        System.out.println(sharedDigit(15, 55));
    }
}
