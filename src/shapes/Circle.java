package shapes;

public class Circle {

    protected double radius;


//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    public Circle(double radius) {
        if(radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.PI * (radius * radius));
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }


}
