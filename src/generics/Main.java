package generics;

import java.util.ArrayList;

public class Main {

    private static void printDouble(ArrayList<Integer> n) {
        for(Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(5);
        items.add(10);
        items.add(15);
    }
}
