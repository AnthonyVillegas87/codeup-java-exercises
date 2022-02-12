package primitives;

public class OperatorsAndExpressions {


    public static void main(String[] args) {
        int result = 1 + 2;

        int previousResult = result - 1;
        System.out.println(previousResult);

        result = result * 10;
        System.out.println(result);

        previousResult = result / 5;
        System.out.println(previousResult);

        //========= Abbreviating Operators
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 2;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        /// ===== Conditional Logic
        boolean isAlien = true;

        if(!isAlien) {
            System.out.println("No alien here");
        } else {
            System.out.println("I told you they were real!!");
        }

        int topScore = 80;
        int secondTopScore = 60;

        if((topScore > secondTopScore) && (topScore < 100) ) {
            System.out.println("You have the highest score");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Eiter or both are true");
        }

        double twenty = 20.00;
        double eighty = 80.00;

        double doubleSum = (twenty + eighty) * 100.00;
        System.out.println(doubleSum);
        double remainderOfSum = doubleSum % 40.00;
        System.out.println(remainderOfSum);
        boolean isRemainderOfSumTrue = (remainderOfSum == 0) ? true : false;
        System.out.println(isRemainderOfSumTrue);
        if(!isRemainderOfSumTrue) {
            System.out.println("Got some remainder");
        }
//        System.out.println(isRemainderOfSumTrue);






    }

}
