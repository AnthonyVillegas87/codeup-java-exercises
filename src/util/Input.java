package util;
import java.util.Scanner;
public class Input {
   private Scanner scanner;

   public String getString() {
       System.out.println("Please enter a string: ");
       String userInput = scanner.nextLine();
       return userInput;
   }

   public Input() {
       this.scanner = new Scanner(System.in);
   }

   boolean yesNo(){
       System.out.println("Enter yes or y: ");
       String userInput = scanner.nextLine().toLowerCase();
       return (userInput.equals("yes") || userInput.equals("y"));
   }

   int getInt(int min, int max) {
       System.out.println("Enter a number between " + min + " and " + max);
       int input = scanner.nextInt();
       if(input < min || input > max) {
           getInt();
       }
       return input;
   }

   int getInt() {
     return getInt(1, 10);
   }

   double getDouble(double min, double max) {
       System.out.println("Enter a number between " + min + " and " + max);
       double dblInput = scanner.nextInt();
       if(dblInput < min || dblInput > max) {
           getDouble();
       }
       return dblInput;
   }

   double getDouble() {
       return getDouble(1, 10);
   }








}
