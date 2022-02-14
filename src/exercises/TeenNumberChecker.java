package exercises;

public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z) {

        return isTeen(x) || isTeen(y) || isTeen(z);
    }

    public static boolean isTeen(int age) {
         if(!(age >= 13 && age <= 19)) {
             return false;
         }
         return true;
    }


}
