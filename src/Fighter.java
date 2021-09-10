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

}
