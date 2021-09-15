package shapes;

public class Circle {

    protected double radius;

//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * (radius * radius));
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }


}
