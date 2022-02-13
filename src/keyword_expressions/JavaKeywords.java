package keyword_expressions;

public class JavaKeywords {

    ///Methods
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;


    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
           return 1;
        } else if (score >= 500 && score < 1000){
            return 2;
        } else if (score >= 100 &&  score < 500) {
            return 3;
        } else {
            return 4;
        }

    }

    public static void main(String[] args) {
        //===== Expressions
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);


       int highScoreResult = calculateHighScorePosition(1500);
       displayHighScorePosition("John", highScoreResult);

       highScoreResult = calculateHighScorePosition(900);
        displayHighScorePosition("Lucy", highScoreResult);

       highScoreResult = calculateHighScorePosition(400);
       displayHighScorePosition("Joey", highScoreResult);

       highScoreResult = calculateHighScorePosition(50);
       displayHighScorePosition("George", highScoreResult);

    }


}
