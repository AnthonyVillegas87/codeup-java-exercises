package exercises;

public class DecimalComparatorTest {

    public static void main(String[] args) {
        boolean decimalTest = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        boolean decimalTest2 = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        boolean decimalTest3 = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(decimalTest);
        System.out.println(decimalTest2);
        System.out.println(decimalTest3);

    }
}
