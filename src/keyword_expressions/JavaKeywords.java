package keyword_expressions;

public class JavaKeywords {


    public static void main(String[] args) {
        //===== Expressions
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);

       boolean gameOver = true;
       int score = 5000;
       int levelCompleted = 5;
       int bonus = 100;

     if(gameOver) {
         int finalScore = score + (levelCompleted * bonus);
         System.out.println("Your final score : " + finalScore);
     }

     score = 10000;
     levelCompleted = 8;
     bonus = 200;
     if (gameOver) {
        int newScore = score + (levelCompleted * bonus);
         System.out.println("Your new score : " + newScore);
     }

    }
}
