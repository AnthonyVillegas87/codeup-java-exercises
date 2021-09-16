package abstractclasses.vehicle;

abstract public class Vehicle {

    public int currentSpeedMph;
    public String directionHeading;
    public int numberOfPassengers;

    public void goFaster(int moreMph) {
        currentSpeedMph += moreMph;
    }


    abstract public void turnOn();

}
