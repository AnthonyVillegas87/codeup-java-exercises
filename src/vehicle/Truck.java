package vehicle;

public class Truck extends Vehicle{

    public Truck(String name, String size) {
        super(name, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("Honk Honk!");
        super.makeNoise();
        System.out.println("Ka-plunk");
    }


}
