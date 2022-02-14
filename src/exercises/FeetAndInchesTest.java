package exercises;

public class FeetAndInchesTest {

    public static void main(String[] args) {

       double calc = FeetAndInches.calcFeetAndInchesToCentimeters(6, 13);
        System.out.println(calc);

        double newCalc = FeetAndInches.calcFeetAndInchesToCentimeters(-10);
        System.out.println(newCalc);
    }
}
