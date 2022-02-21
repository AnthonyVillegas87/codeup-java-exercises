package bank;

public class Main {


    public static void main(String[] args) {
        BankAccount bobsAccount;
        bobsAccount = new BankAccount(571183, 0.00, "Bobby Brown", "myemail@gmail.com", "(210) 881-7267");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());

        bobsAccount.withdraw(100);

        bobsAccount.deposit(55);
        bobsAccount.withdraw(56);

        bobsAccount.deposit(101);
        bobsAccount.withdraw(40);
    }
}
