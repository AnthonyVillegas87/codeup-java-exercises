package exercises;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean equalDecimalPlaces = Math.ceil(num1) == Math.ceil(num2);

        if(!equalDecimalPlaces) {
            return false;
        }
        return true;
    }
}
