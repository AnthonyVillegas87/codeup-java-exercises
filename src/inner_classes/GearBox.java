package inner_classes;

import java.util.ArrayList;

public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
       if((number > 0) && (number <= maxGears)) {
           this.gears.add(new Gear(number, ratio));
       }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    public void changeGear(int gear) {
        if((gear >= 0) && (gear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = gear;
            System.out.println("Gear " + gear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

/*
Example of inner an inner class : There are 2 special cases of inner classes
* 1 : Local Classes, declared inside a block such as a method or an if conditional. Scope is restricted completely to the particular block in which its defined. Used less often
* 2 : Anonymous Classes, also a local class but with no name. They have to be declared & instantiated at the same time because there's no name. They're used only once. Very Common for attaching buttons to event handlers.
 */
    // A good foundation of building on Encapsulation using an inner class especially when no other classes are using it
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
