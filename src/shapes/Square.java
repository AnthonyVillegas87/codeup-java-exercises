package shapes;

public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }


    @Override
    public void setLength(int side) {
        this.length = side;
    }

    @Override
    public void setWidth(int side) {
    this.width = side;
    }
//    protected int side;
//
//
//    Square(int side) {
//        super(side, side);
//        this.side = side;
//
//    }
//
//    @Override
//    public int getArea() {
//        return 4 * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return Math.pow(side, 2);
//    }
}
