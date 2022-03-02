package bills_burgers;

public class Main {


    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Turkey", 3.56, "White Bun");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAdditionA("Tomato", 0.25);
        hamburger.addHamburgerAdditionB("Lettuce", 0.75);
        hamburger.addHamburgerAdditionC("Cheese", 1.25);
        System.out.println("Total price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.00);
        healthyBurger.addHamburgerAdditionA("Egg", 1.50);
        healthyBurger.addHealthAdditionA("Lentils", 3.00);
        System.out.println( "Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAdditionA("Should not do this....", 50.00);
        db.itemizeHamburger();

    }
}
