package vehicle;

public class Garage {
    Vehicle[] vehicles;


    public void alarmCascade() {
            for(Vehicle vehicle : vehicles) {
                System.out.println(vehicle.getName() + " goes ");
                vehicle.makeNoise();
            }
    }

}
