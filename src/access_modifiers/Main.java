package access_modifiers;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("Anthony");

        myAccount.deposit(1000);
        myAccount.withdraw(200);
        myAccount.withdraw(-200);
        myAccount.deposit(-20);
        myAccount.calculateBalance();

        System.out.println("Balance on your account is " + myAccount.getBalance());

    }




}
