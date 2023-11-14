import java.util.Scanner;

public class Email {

    // Encapsulate using private access
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;


    // Constructor to receive first & last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method to return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }



    // Ask for department: NOTE, THIS IS NOT TO BE PUBLIC
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if(depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "not available";
        }
    }


    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
          int random = (int)(Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(random);
        }

        return new String(password);
    }
    // Set the mailbox capacity

    // Set an alternate email

    // Change the password
}
