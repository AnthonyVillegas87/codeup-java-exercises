package shapes;

public class Rectangle {
   protected int width;
   protected int length;

   Rectangle(int length, int width) {
       this.length = length;
       this.width = width;
   }

   public int getArea() {
       return length * width;
   }

   public int getPerimeter() {
       return 2 * (length + 2) * width;
   }

}
