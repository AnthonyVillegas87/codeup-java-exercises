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








}
