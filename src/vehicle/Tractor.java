package vehicle;

public final class Tractor extends Vehicle{

    public Tractor(String name, String size) {
        super(name, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("Screech! Screech!");
        super.makeNoise();
    }
}
