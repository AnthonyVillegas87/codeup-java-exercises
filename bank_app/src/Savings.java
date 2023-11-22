public class Savings extends Account {

    // List properties specific to Savings account
        int safetyDepositBoxId;
        int safetyDepositBoxKey;

    // Call Constructor to initialize settings for the Savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("New Savings Account ");

    }

    // List any methods specific to Saving account



}
