package composition;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions demensions;


    public Case(String model, String manufacturer, String powerSupply, Dimensions demensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.demensions = demensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDemensions() {
        return demensions;
    }
}
