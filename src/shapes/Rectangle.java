package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int shapeLength, int shapeWidth) {
        super(shapeLength, shapeWidth);
    }

    @Override
    public double getPerimeter() {
        return ((length * 2) + (width * 2));
    }

    @Override
    public double getArea() {
        return  length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
    this.width = width;
    }
//   protected int width;
//   protected int length;
//
//   Rectangle(int length, int width) {
//       this.length = length;
//       this.width = width;
//   }
//
//   public int getArea() {
//       return length * width;
//   }
//
//   public double getPerimeter() {
//       return ((2 * length) + (2 * width));
//   }

}
