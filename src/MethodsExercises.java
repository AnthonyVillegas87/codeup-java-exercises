public class MethodsExercises {


// #1.
    public static int add(int x, int y){
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static double modulus(int x, int y) {
        return x % y;
    }

    // Bonus
    public static int multi(int x, int y) {
        if(y == 1) return x;
        return x + multi(x, y -1);
    }

    // #2.
//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//    }



//    public static long fibSequence(int x) {
//        if(x == 0) return 0;
//        if(x < 2) return 1;
//        return fibSequence(x - 1) + fibSequence(x - 2);
//    }
//
//    public static long factorial(int x) {
//        if(x == 1) return 1;
//        return x * factorial(x - 1);
//    }




    public static void main(String[] args) {
//      int number = add(4, 5);
//      int subNum = subtraction(10, 5);
//      int multiNum = multiplication(4, 6);
//      int divideNum = division(10,5);
       //System.out.println(getInteger(10, 4));


    }
}
