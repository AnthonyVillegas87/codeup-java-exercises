package vehicle;

public class Vehicle {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Beep Beep!");
    }

    Vehicle(String name) {
        this.name = name;
    }
}
