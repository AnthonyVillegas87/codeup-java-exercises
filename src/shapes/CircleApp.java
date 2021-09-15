package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
            Input input = new Input();
            double radius = input.getDouble();
            Circle newCircle = new Circle(radius);

        System.out.println(" The area of a circle is: " + newCircle.getArea());
        System.out.println(" The circumference of the circle is: " + newCircle.getCircumference());
    }

}
