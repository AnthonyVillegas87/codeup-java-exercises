public class Quote {

    public static void randomQuote(){
      switch ((int) (Math.random() * 4) + 1){
         case 1 -> {
             System.out.println("Water can flow...");
         }
         case 2 ->{
             System.out.println("or it can crash...");
         }
         case 3 -> {
             System.out.println("Be water my friend.");
         }
         case 4 -> {
             System.out.println("Respond like an echo.");
         }
         default -> {
             System.out.println(".....");
         }

        };

    }
}
