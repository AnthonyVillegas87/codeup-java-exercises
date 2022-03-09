package unboxing_autoboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // AutoBoxing
        // Converting a primitive type to the OBJECT WRAPPER

        // Unboxing
        // Converting from the OBJECT WRAPPER back to the primitive type



        // AutoBoxing
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        // Unboxing
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        // AutoBoxing
        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        // Unboxing
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }


    }



}
