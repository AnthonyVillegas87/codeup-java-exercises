package bank_branch;


import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    // ADD A NEW BRANCH
    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            //CALLING BRANCH CONSTRUCTOR TO PASS ALONG BRANCH NAME
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }


    // ADD A CUSTOMER TO THAT BRANCH W/ INITIAL TRANSACTION AMOUNT
    public boolean addCustomer(String branchName, String customerName, double initAmount) {

        // FIND THE BRANCH NAME FIRST
        Branch branch = findBranch(branchName);

        // CHECK IF BRANCH EXISTS
        if(branch != null) {

            // CALL THE newCustomer() FROM THE BRANCH CLASS to EXECUTE ADDING THE CUSTOMER W/ THEIR INIT AMOUNT
            return branch.newCustomer(customerName, initAmount);
        }
        return false;
    }


    // ADD A TRANSACTION FOR AN EXISTING CUSTOMER FOR THAT BRANCH
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    // FIND A BRANCH: MAKE PRIVATE TO USE INTERNALLY
    private Branch findBranch(String branchName) {

        // GO THRU OUR LIST OF CUSTOMERS/RECORDS IN THE ARRAY LIST
        for(int i = 0; i< branches.size(); i++) {

            // RETRIEVE THE OBJECT FROM THE LIST AND CHECK TO SEE IF THE CUSTOMER MATCHES WHAT'S ON FILE
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    // SHOW A LIST OF CUSTOMERS FOR A PARTICULAR BRANCH & OPTIONALLY A LIST OF THEIR TRANSACTIONS
    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            // GET A LIST OF CUSTOMERS FOR THE BRANCH THAT WAS JUST RETRIEVED
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++) {

                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");

                // OPTIONALLY SHOW TRANSACTIONS
                if(showTransactions) {
                    System.out.println(" Transactions");
                    // RETURN A LIST OF TRANSACTIONS FOR THAT PARTICULAR CUSTOMER
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }





}
