package mobile;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("210 573 4850");




    // START PHONE
    public static void startPhone() {
        System.out.println("Starting phone...");
    }

    // PRINT ACTIONS
    public static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to turn off\n" +
                "1 - to print contacts\n" +
                "2 - to add new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n " +
                "5 - query if a contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    // ADD NEW CONTACT
    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    public static void main(String[] args) {

        // ADD MENU OF OPTIONS THAT ARE AVAILABLE
        /*
        * OPTIONS -> QUIT
        * -> PRINT LIST OF CONTACTS
        * -> ADD NEW CONTACT
        * -> UPDATE EXISTING CONTACT
        * -> REMOVE CONTACT
        * -> SEARCH/FIND CONTACT
         */


        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
}
