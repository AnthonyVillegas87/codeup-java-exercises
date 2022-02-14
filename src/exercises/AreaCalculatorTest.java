package exercises;

public class AreaCalculatorTest {

    public static void main(String[] args) {
        double pi = AreaCalculator.area(5.0);
        System.out.println(pi);

        double rectangle = AreaCalculator.area(5.0, 4.0);
        System.out.println(rectangle);
    }
}
