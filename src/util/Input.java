package util;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Input {
   private Scanner scanner;

   public String getString() {
//       System.out.println("Please enter a string: ");
       String userInput = scanner.nextLine();
       return userInput;
   }

   public Input() {
       this.scanner = new Scanner(System.in);
   }

  public boolean yesNo(){
       System.out.println("Enter yes or y: ");
       String userInput = scanner.nextLine().toLowerCase();
       return (userInput.equals("yes") || userInput.equals("y"));
   }

   public int getInt(int min, int max)  throws NumberFormatException{
       System.out.println("Enter a number between " + min + " and " + max);
    //   int input = scanner.nextInt();
      int input = Integer.valueOf(getString());
      try {
          input = Integer.valueOf(getString());
      } catch (NumberFormatException nfx) {
          System.out.println("Uh Oh " + nfx);
          return getInt(min, max);
       }
       if(input < min || input > max) {
           getInt();
       }
       return input;
   }

   public int getInt() {
     return getInt(1, 10);
   }

   public double getDouble(double min, double max) throws NumberFormatException{
       System.out.println("Enter a number between " + min + " and " + max);
    //   double dblInput = scanner.nextInt();
       double dblInput;
       try {
           dblInput = Double.valueOf(getString());
       } catch (NumberFormatException nfx) {
           System.out.println("Uh Oh: " + nfx);
           return getDouble(min, max);
       }

       if(dblInput < min || dblInput > max) {
           getDouble();
       }
       return dblInput;
   }

  public double getDouble() {
       return getDouble(1, 10);
   }








}
