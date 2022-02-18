package exercises;

import java.util.Scanner;

public class InputCalculator {

    public static void inputSumThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int count = 0;
        while(true) {
            System.out.println("Enter your favorite numbers: ");
            boolean isInt = sc.hasNextInt();

            if(isInt) {
                int input = sc.nextInt();
                count++;

                sum += input;
                average = sum / input;

                if(count == 6) {
                    break;
                }
            } else {
                System.out.println("Invalid Input");
            }
            sc.nextLine();
        }
        System.out.println("Sum = " + sum + " Avg = " + average);
        sc.close();
    }

    public static void main(String[] args) {
        inputSumThenPrintSumAndAverage();
    }

}
