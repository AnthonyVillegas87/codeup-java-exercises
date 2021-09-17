package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    Rectangle(){
        super( 0,0);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

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
