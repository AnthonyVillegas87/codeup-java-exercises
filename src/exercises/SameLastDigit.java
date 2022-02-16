package exercises;

public class SameLastDigit {

    public static boolean sameLastDigit(int num1, int num2, int num3) {
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)) {
            return ((num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sameLastDigit(41, 22, 71));
        System.out.println(sameLastDigit(9, 99, 999));
    }
}
