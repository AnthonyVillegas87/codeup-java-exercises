package numbers;

public class BiNumbersTest {


    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2, 3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());

        numbers.doubleValue();

        System.out.println(numbers.getNumberOne());
        System.out.println(numbers.getNumberTwo());
    }

}
