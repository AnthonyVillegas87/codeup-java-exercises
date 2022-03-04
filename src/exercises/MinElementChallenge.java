package exercises;

import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    private static int[] readInteger(int number) {
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            System.out.println("Enter " + number + " integer values. \r");
            int result = scanner.nextInt();
            scanner.nextLine();
            values[i] = result;
        }


        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }

        return min;
    }



    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readInteger(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

    }
}
