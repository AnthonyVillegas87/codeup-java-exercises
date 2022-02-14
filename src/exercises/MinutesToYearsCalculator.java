package exercises;

public class MinutesToYearsCalculator {

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
        }

        long year =  (minutes / 525600);
        long days = (minutes % year);

        System.out.println(minutes + "min = " + year + "y and " + days + "d");
    }

}
