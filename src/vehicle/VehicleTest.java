package vehicle;

public class VehicleTest {

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

 //      Truck ford = new Truck("Bronco");
 //       ford.setName();
//        System.out.println("My " + ford.getName() + " goes: ");
//        ford.makeNoise();
//
//        Tractor johnDeere = new Tractor("John Deere");
//        System.out.println("My " + johnDeere.getName() + " goes: ");
//        johnDeere.makeNoise();
    }
}
