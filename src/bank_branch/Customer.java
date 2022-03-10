package bank_branch;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initAmount) {
        this.name = name;
        // INIT TRANSACTIONS
        this.transactions = new ArrayList<Double>();
        addTransaction(initAmount);

    }

    // MECHANISM TO ADD TRANSACTIONS
    public void addTransaction(double amount) {
        // add() convert from a primitive to an OBJECT WRAPPER
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
