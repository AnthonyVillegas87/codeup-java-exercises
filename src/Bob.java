import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Bob");
        String myInput = sc.nextLine();

        if(myInput.endsWith("?")){
            System.out.println("Sure");
        } else if(myInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if(myInput.equals(" ")) {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("crickets....");
        }
    }
}
