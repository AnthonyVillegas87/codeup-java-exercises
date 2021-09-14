package vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Car camry = new Car();
        camry.setName("Camry");


        Truck chevrolet = new Truck();
        chevrolet.setName("Chevrolet");

        Vehicle[] carsInGarage = new Vehicle[2];
        carsInGarage[0] = camry;
        carsInGarage[1] = chevrolet;

        Garage garage = new Garage();
        garage.vehicles = carsInGarage;
        garage.alarmCascade();

    }
}
