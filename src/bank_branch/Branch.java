package bank_branch;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    // ADD A NEW CUSTOMER WITH AN INITIAL TRANSACTION AMOUNT
    public boolean newCustomer(String customerName, double initAmount) {
        if(findCustomer(customerName) == null) {

            // CALLING CONSTRUCTOR CODE IN THE CUSTOMER CLASS
            this.customers.add(new Customer(customerName, initAmount));
            return true;
        }
        return false;
    }


    // ADD ADDITIONAL TRANSACTIONS FOR EACH CUSTOMER/BRANCH
    public boolean addCustomerTransaction(String customerName, double amount) {

        // GRAB EXISTING CUSTOMER RECORD AND UPDATE IT WITH EACH TRANSACTION MADE
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {

            // CALLING addTransaction() from the CUSTOMER CLASS
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    // FIND A CUSTOMER: MAKE PRIVATE TO USE INTERNALLY
    private Customer findCustomer(String customerName) {

        // GO THRU OUR LIST OF CUSTOMERS/RECORDS IN THE ARRAY LIST
        for(int i = 0; i< customers.size(); i++) {

            // RETRIEVE THE OBJECT FROM THE LIST AND CHECK TO SEE IF THE CUSTOMER MATCHES WHAT'S ON FILE
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
