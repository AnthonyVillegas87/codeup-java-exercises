import java.util.Scanner;


/*
*  Email Application - as an IT Support Admin Specialist, you are charged with the task of creating
*           email accounts for new hires;
*
*
*  Generate an email with the following syntax: firstname.lastname@department.company.com
*  Determine the department (sales, development, accounting), if none leave blank
*  Generate a random String for a password
*  Have set methods to change the password, set the mailbox capacity, and define an alternate email address
*  Have get methods to display the name, email, and mailbox capacity
*
*
*
* */
public class Email {

    // Encapsulate using private access
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    private String companySuffix = "encipher.com";

    // Constructor to receive first & last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
       // System.out.println("Department: " + this.department);

        // Call a method to return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);


        // Combine elements to generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is: " + email);
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
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set an alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showEmployeeInfo() {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }

}
