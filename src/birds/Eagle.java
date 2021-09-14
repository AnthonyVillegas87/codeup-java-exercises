package birds;

public class Eagle extends Bird {
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Whistle Whistle");
    }
}
