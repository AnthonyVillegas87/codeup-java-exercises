package java_basics;

import java.util.Arrays;

public class LearningArrays {

    int[] values = {1, 3, 5, 7, 9, 11, 12, 13, 15, 17};

    public int[] inputNumbers(int[] bigArr) {
       int[] result = new int[100];
        for (int i = 0; i < bigArr.length; i++) {
                result[i] += i;
        }
        return result;
    }

    public int[] getValues() {
        return values;
    }

    public static void main(String[] args) {
        LearningArrays newClass = new LearningArrays();
        int[] newArr = new int[100];
        System.out.println(Arrays.toString(newClass.inputNumbers(newArr)));
        System.out.println(Arrays.toString(newClass.getValues()));

        String[] names = new String[] {"Jon", "Jacob", "Nik", "Antonio", "El Chapo"};
        System.out.println("The spanish name in this array is " + names[4]);
    }

}
