package data_structures;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        //view the elements in the array
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }


        //OR
        /*
        use the copyOf() method to create our Array
         */
       // int[] sortedArr = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;

            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    //swap in descending order
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

       return sortedArray;
    }


    public static double getAverage(int[] array) {
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }



    public static void main(String[] args) {
        //Initialize the array w/ 10 elements
        int[] myIntArray = new int[25];

        //for loop to create each element in an array
        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);





    }
}
