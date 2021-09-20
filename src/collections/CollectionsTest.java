package collections;



import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionsTest {

    public static ArrayList<Integer> omit2s(ArrayList<Integer> integers) {
        integers.removeIf(number -> number == 2);
        return integers;
    }

    public static HashMap<String, String> createMap(ArrayList<String>key, ArrayList<String>value) {
        HashMap<String, String> values = new HashMap<String, String>();
        return  values;
    }


    public static void main(String[] args) {
        List<String> keys = new ArrayList<>(Arrays.asList(
                "first",
                "second",
                "third",
                "fourth"
        ));

        List<String> value = new ArrayList<>(Arrays.asList(
                "one",
                "two",
                "three",
                "four"
        ));






//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(33);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(2);
//        System.out.println();
//    }

    }
}