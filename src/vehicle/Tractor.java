package vehicle;

public final class Tractor extends Vehicle{
    Tractor(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Screech! Screech!");
        super.makeNoise();
    }
}
