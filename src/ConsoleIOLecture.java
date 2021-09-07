import java.util.Scanner;
public class ConsoleIOLecture {
    public static void main(String[] args) {
//        String myCohort = "Draco";
//        String timeOfDay = "morning";
//        System.out.println(myCohort);
//        System.out.printf("Good %s, %s%n", timeOfDay, myCohort);
//        System.out.println("Will this be a separate line?");

        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name: ");
//        String userInput = scanner.nextLine();
//        System.out.println("Your word was " + userInput);
//        System.out.printf("Your string was %s", userInput);
//        System.out.printf("Your name is %s," + userInput);

//        System.out.println("Enter an integer: ");
        //        int userInput = scanner.nextInt();
        //        System.out.printf("You entered %d%n", userInput);
        //        Option 1: an extra nextLine()
        //        String ghostString = scanner.nextLine();
        //      Option 2: concatenate a .next() and a .nextLine()
        //        String firstString = scanner.next() + scanner.nextLine();
        //        Option 3: use all .nextLine - parse the input
        //        int userInputInt = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter a string: ");
//        String firstString = scanner.nextLine();
//        System.out.println("Enter another string: ");
//        String secondString = scanner.nextLine();
//        System.out.println("First sentence: " + firstString + "\nSecond string: " + secondString);

//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10){
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);

//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        do {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        } while (i<10);
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);

//    int i;
//    for( i = 0; i < 10; i++) {
//        System.out.println("Now im in the loop. i has not incremented yet and its value is " + i);
//    }
//        System.out.println("This is out the loop. the conditional has tested false. the value value of i is what it last incremented to. See? " + i);

    int numberOfCansOfBigRed = 99;
    while(numberOfCansOfBigRed > 0) {
        System.out.println(numberOfCansOfBigRed + "cans of big red on the wall");
        System.out.println(numberOfCansOfBigRed + "cans of big red");
        System.out.println("take one down, pass it around");
        numberOfCansOfBigRed--;
    }


    }



}
