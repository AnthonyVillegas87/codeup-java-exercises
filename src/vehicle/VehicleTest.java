package vehicle;

public class VehicleTest {

    public static void main(String[] args) {
        Car hyundai = new Car();
        hyundai.setName("Palisade");
        System.out.println("My " + hyundai.getName() + " goes: ");
        hyundai.makeNoise();


        Truck ford = new Truck();
        ford.setName("Bronco");
        System.out.println("My " + ford.getName() + " goes: ");
        ford.makeNoise();
    }
}
