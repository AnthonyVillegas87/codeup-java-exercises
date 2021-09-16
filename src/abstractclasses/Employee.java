package abstractclasses;

abstract public class Employee {

   public abstract String doWork();

   public void onboardEmployee() {
      System.out.println("Welcome!");
   }

   public void quit() {
      System.out.println("No longer on board.");
   }

   public void sayHi() {
      System.out.println("Hello, my name is: ");
   }

}
