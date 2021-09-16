package vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Car camry = new Car("Camry");
  //      camry.setName();


        Truck chevrolet = new Truck("Chevrolet");
  //      chevrolet.setName();

        Tractor johnDeere = new Tractor("John Deere");

        Vehicle[] carsInGarage = new Vehicle[3];
        carsInGarage[0] = camry;
        carsInGarage[1] = chevrolet;
        carsInGarage[2] = johnDeere;

        Garage garage = new Garage();
        garage.vehicles = carsInGarage;
        garage.alarmCascade();

    }
}
