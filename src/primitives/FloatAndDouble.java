package primitives;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max vale = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max vale = " + myMaxDoubleValue);

        int myIntVal = 5 / 3;
        float myFloatVal =  5f / 3f;
        double myDoubleVal = 5d / 3d;
        System.out.println("My integer value = " + myIntVal);
        System.out.println("My float value = " + myFloatVal);
        System.out.println("My double value = " + myDoubleVal);

         double numberOfPounds = 100d;
         double convertedKilo = numberOfPounds * 0.45359237d;

        System.out.println("Converted kilograms = " + convertedKilo);
        
    }
}
