package exercises;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        boolean range = true;

        if(year % 4 != 0) {
            range = false;
        } else if(year % 100 != 0) {
            range = false;
        } else if(year % 400 != 0) {
            range = false;
        }
            return range;


    }
}
