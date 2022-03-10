package bank_branch;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank("Chase Bank");
        bank.addBranch("Spring Branch");

        bank.addCustomer("Spring Branch", "Boomero", 50.50);
        bank.addCustomer("Spring Branch", "Tim", 255.00);
        bank.addCustomer("Spring Branch", "Candy", 425.75);

        bank.addBranch("San Antonio");
        bank.addCustomer("San Antonio", "Nadine", 150.50);

        bank.addCustomerTransaction("Spring Branch", "Tim", 45.22);
        bank.addCustomerTransaction("Spring Branch", "Tim", 125.22);
        bank.addCustomerTransaction("Spring Branch", "Boomero", 500.65);

        bank.listCustomers("Spring Branch", true);
        bank.listCustomers("San Antonio", true);

        if(!bank.addCustomer("Cibolo", "Brian", 5.55)) {
            System.out.println("Error Cibolo branch does not exist");
        }

    }
}
