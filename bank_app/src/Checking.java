public class Checking extends Account{

    // List properties specific to a Checking account
        int debitCardNumber;
        int debitCardPin;

    // Call Constructor to initialize Checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("New Checking account ");

    }

    // List any methods specific to the Checking account


}
