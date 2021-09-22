import java.lang.reflect.Array;
import java.util.Arrays;
public class MyMathMethods {

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double quotient(int x, int y) {
        return (double) x / y;
    }

    public static int quotient(double x, double y) {
        return (int) (x / y);
    }

    public static int arraySum(int[] myArr) {
        int sum = 0;
        for(int i = 0; i < myArr.length; i++ ) {
            sum += myArr[i];
        }
        return sum;
    }


}
