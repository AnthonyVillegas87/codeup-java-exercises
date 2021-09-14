package vehicle;

public class Truck extends Vehicle{

    @Override
    public void makeNoise() {
        System.out.println("Honk Honk!");
        super.makeNoise();
        System.out.println("Ka-plunk");
    }
}
