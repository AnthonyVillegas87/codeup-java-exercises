package vehicle;

public class VehicleTest {

    public static void main(String[] args) {
        Car hyundai = new Car("Palisade");
 //      hyundai.setName();
        System.out.println("My " + hyundai.getName() + " goes: ");
        hyundai.makeNoise();


        Truck ford = new Truck("Bronco");
 //       ford.setName();
        System.out.println("My " + ford.getName() + " goes: ");
        ford.makeNoise();

        Tractor johnDeere = new Tractor("John Deere");
        System.out.println("My " + johnDeere.getName() + " goes: ");
        johnDeere.makeNoise();
    }
}
