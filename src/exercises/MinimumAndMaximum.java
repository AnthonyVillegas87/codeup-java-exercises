package exercises;

import java.util.Scanner;

public class MinimumAndMaximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNumber = 0;
        int minNumber = 0;
        int count = 0;

        while(true) {
            int order = count + 1;
            System.out.println("Please enter a number: ");
            boolean isNextInt = sc.hasNextInt();

            if(isNextInt) {
                int number = sc.nextInt();
                count++;
                maxNumber = number;
                minNumber = number;
                if(count == 2) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();
        }
        System.out.println("The minimum number = " +  minNumber + " and the maximum number = " +  maxNumber);
        sc.close();
    }
}
