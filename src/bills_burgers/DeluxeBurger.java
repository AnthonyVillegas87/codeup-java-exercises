package bills_burgers;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 12.50, "White");
        super.addHamburgerAdditionA("Chips", 2.75);
        super.addHamburgerAdditionB("Drink", 1.80);
    }

    @Override
    public void addHamburgerAdditionA(String name, double price) {
        System.out.println("Not allowed with deluxe burger");
    }

    @Override
    public void addHamburgerAdditionB(String name, double price) {
        System.out.println("Not allowed with deluxe burger");

    }

    @Override
    public void addHamburgerAdditionC(String name, double price) {
        System.out.println("Not allowed with deluxe burger");

    }

    @Override
    public void addHamburgerAdditionD(String name, double price) {
        System.out.println("Not allowed with deluxe burger");

    }
}
