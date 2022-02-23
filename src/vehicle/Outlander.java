package vehicle;

public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 5, 6, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
