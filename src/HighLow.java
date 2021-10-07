import java.util.Scanner;

public class HighLow {
    public static void highestNumber() {
        Scanner sc = new Scanner(System.in);

        int num = (int) (Math.random() * 100) + 1;
        System.out.println(num);

        System.out.println("Please select a number between 1 & 100: ");
        int userInput = sc.nextInt();

        if(userInput < num) {
            System.out.println("HIGHER");
        } else if(userInput > num) {
            System.out.println("LOWER");
        } else {
            System.out.println("GREAT GUESS!");
        }


    }
    public static void main(String[] args) {
        highestNumber();
    }
}
