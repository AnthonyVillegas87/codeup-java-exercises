package algorithms;

public class Recursion {

    //Factorial Algorithm

    /*
    * If num is equal to 0, the factorial is 1. Stop. We have the result. Otherwise...
    * set the multiplier to 1
    * set the factorial to 1
    * while multiplier is not equal to num, do steps 5 and 6
    * multiply factorial by multiplier and assign the result to factorial
    * add 1 to multiplier
    * Stop. The result is factorial
     */

    //1! = 1! * 0 = 1;
    //2! = 2 * 1 = 2 * 1!
    //3! = 3 * 2 * 1 = 3 * 2!
    //4! = 4 * 3 * 2 * 1 = 4 * 3!
    public static int factorial(int num) {
        if(num == 0) return 1;

        return num * factorial(num - 1);
    }


    public static void main(String[] args) {
        int number = 3;

        System.out.println(Recursion.factorial(number));
    }

}
