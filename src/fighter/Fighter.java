package fighter;

public class Fighter {

    public String name;
    public int hitPoints;
    public int maxDamage;

    public void printStats(){
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    public void battleRoar() {
        System.out.println("I am " + name + ", hear me roar!");
    }

    public int attackRoll() {
        return D20.roll20();
    }

    public Fighter() {

    }

    public Fighter(String name, int hitPoints, int maxDamage) {
        System.out.println("A new fighter has emerged.");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.printStats();
    }


    /*
    The public and private keywords are used to define what parts of code have access to other classes, methods, constructors, and instance variables.
    Encapsulation is a technique used to keep implementation details hidden from other classes. Its aim is to create small bundles of logic.
    The this keyword can be used to designate the difference between instance variables and local variables.
    Local variables can only be used within the scope that they were defined in.
    The this keyword can be used to call methods when writing classes.
         */

}
