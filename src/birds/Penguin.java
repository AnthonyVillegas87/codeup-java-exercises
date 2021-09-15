package birds;

public class Penguin extends Bird {

    @Override
    public void makeNoise() {
        System.out.println("Honk Honk");
    }


    Penguin() {
        super("Tuxedo");
    }
}
