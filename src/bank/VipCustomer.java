package bank;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("New Customer", 0, "customeremail@default.com");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String customerName,double creditLimit) {
        this(customerName, creditLimit, "unknown");
    }


    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
