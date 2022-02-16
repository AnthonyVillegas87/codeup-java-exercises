package exercises;

public class AllFactors {

    public static void printFactors(int num) {
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printFactors(32);
    }
}
