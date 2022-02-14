public class SpeedConverterMain {

    public static void main(String[] args) {

      long miles = SpeedConverter.toMilesPerHour(50.2);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(50.2);
    }
}
