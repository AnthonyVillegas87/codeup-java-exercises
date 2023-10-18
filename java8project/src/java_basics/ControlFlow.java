package java_basics;

public class ControlFlow {


    public static void main(String[] args) {

        boolean hungry = true;
        if(hungry) {
            System.out.println("I'm ordering through Doordash tonight... ");
        } else {
            System.out.println("I'm not hungry.");
        }



        int hungerRating = 5;
        if (hungerRating < 6) {
            System.out.println("Not in the mood to eat");
        } else {
            System.out.println("I need food!!!!");
        }




        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if(currentTemp < favoriteTemp - 30) {
            opinion = "It's pretty damn cold!!";
        } else if(currentTemp < favoriteTemp - 20) {
            opinion = "It's kinda nippy";
        } else {
            opinion = "It's a beautiful day!";
        }

        System.out.println(opinion);
    }
}
