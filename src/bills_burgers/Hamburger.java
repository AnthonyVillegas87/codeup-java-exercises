package bills_burgers;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    //Track additional items like lettuce, tomato, onions etc.
    private String additionalItemNameA;
    private double additionalItemPriceA;

    private String additionalItemNameB;
    private double additionalItemPriceB;

    private String additionalItemNameC;
    private double additionalItemPriceC;

    private String additionalItemNameD;
    private double additionalItemPriceD;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAdditionA(String name, double price) {
        this.additionalItemNameA = name;
        this.additionalItemPriceA = price;
    }

    public void addHamburgerAdditionB(String name, double price) {
        this.additionalItemNameB = name;
        this.additionalItemPriceB = price;
    }

    public void addHamburgerAdditionC(String name, double price) {
        this.additionalItemNameC = name;
        this.additionalItemPriceC = price;
    }

    public void addHamburgerAdditionD(String name, double price) {
        this.additionalItemNameD = name;
        this.additionalItemPriceD = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + " price is " + this.price);

        if(this.additionalItemNameA != null) {
            hamburgerPrice += this.additionalItemPriceA;
            System.out.println("Added " + this.additionalItemNameA + " for an extra " + this.additionalItemPriceA);
        }
        if(this.additionalItemNameB != null) {
            hamburgerPrice += this.additionalItemPriceB;
            System.out.println("Added " + this.additionalItemNameB + " for an extra " + this.additionalItemPriceB);
        }
        if(this.additionalItemNameC != null) {
            hamburgerPrice += this.additionalItemPriceC;
            System.out.println("Added " + this.additionalItemNameC + " for an extra " + this.additionalItemPriceC);
        }
        if(this.additionalItemNameD != null) {
            hamburgerPrice += this.additionalItemPriceD;
            System.out.println("Added " + this.additionalItemNameD + " for an extra " + this.additionalItemPriceD);
        }

        return hamburgerPrice;
    }


}
