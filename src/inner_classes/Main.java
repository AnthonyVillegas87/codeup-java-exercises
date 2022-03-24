package inner_classes;

public class Main {




    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);

        // In order to create a Gear class, we first need to declare the outer class first(GearBox)
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));

    }
}
