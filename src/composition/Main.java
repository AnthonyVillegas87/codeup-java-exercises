package composition;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor monitor = new Monitor("27inch Premium", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, monitor, motherboard);
//
//       thePC.powerUp();


//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("King", 4, 3, 1, 1);
//
//        Lamp lamp = new Lamp("Modern", false, 75);
//
//        Room room = new Room("Anthony", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//        room.makeBed();
//        room.getLamp().turnOn();

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new print count for printer =" + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new print count for printer =" + printer.getPagesPrinted());

    }
}
