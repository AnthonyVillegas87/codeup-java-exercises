public class SpeedConverterMain {

    public static void main(String[] args) {

      long miles = SpeedConverter.toMilesPerHour(12.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(12.5);
    }
}
