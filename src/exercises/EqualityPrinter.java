package exercises;

public class EqualityPrinter {


    public static void printEqual(int x, int y, int z) {
        if(x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        }

        if((x == y) && (y == z) && (z == x)) {
            System.out.println("All numbers are equal");
        } else if((x != z) && (x != y)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither are different or equal");
        }
    }
}
