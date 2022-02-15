package exercises;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if((month < 1 || month > 12) && (year < 1 || year > 9999)) {
            return -1;
        }

        int numberOfDaysInMonth = 0;
        switch(month) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                numberOfDaysInMonth = 31;
              break;
            case 2 :
                if (isLeapYear(year)) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                numberOfDaysInMonth = 30;
                break;
        }
        return numberOfDaysInMonth;
    }
}
