package exercises;



public class LeapYearCalculatorTest {

    public static void main(String[] args) {
        int caseOne = LeapYearCalculator.getDaysInMonth(1, 2020);
        int caseTwo = LeapYearCalculator.getDaysInMonth(2, 2020);
        int caseThree = LeapYearCalculator.getDaysInMonth(2, 2018);
        int caseFour = LeapYearCalculator.getDaysInMonth(-1, 2020);

        System.out.println(caseOne);
        System.out.println(caseTwo);
        System.out.println(caseThree);
        System.out.println(caseFour);


    }






}
