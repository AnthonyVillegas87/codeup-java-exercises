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

        BankAccount joesAccount;
        joesAccount = new BankAccount("Joe", "joesemail@yahoo.com", "(512) 882-2517");
        System.out.println(joesAccount.getAccountNumber() + " name " + joesAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("Craig", 18000.00);
        System.out.println(person2.getCustomerName());

        VipCustomer person3 = new VipCustomer("Ray", 500.00, "rayemail@yahoo.com");
        System.out.println(person3.getCustomerName());
    }
}
