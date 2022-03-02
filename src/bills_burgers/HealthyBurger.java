package bills_burgers;

public class HealthyBurger extends Hamburger {
    private String healthyExtraNameA;
    private double healthyExtraPriceA;

    private String healthyExtraNameB;
    private double healthyExtraPriceB;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");

    }

    public void addHealthAdditionA(String name, double price) {
        this.healthyExtraNameA = name;
        this.healthyExtraPriceA = price;
    }

    public void addHealthAdditionB(String name, double price) {
        this.healthyExtraNameB = name;
        this.healthyExtraPriceB = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();

        if(this.healthyExtraNameA != null) {
            hamburgerPrice += this.healthyExtraPriceA;
            System.out.println("Added " + this.healthyExtraNameA + " for an extra " + this.healthyExtraPriceA);
        }
        if(this.healthyExtraNameB != null) {
            hamburgerPrice += this.healthyExtraPriceB;
            System.out.println("Added " + this.healthyExtraNameB + " for an extra " + this.healthyExtraPriceB);
        }
        return hamburgerPrice;
    }
}
