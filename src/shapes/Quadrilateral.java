package shapes;

 abstract class Quadrilateral extends Shape implements Measurable{

    protected int length;
    protected int width;


    public Quadrilateral(int shapeLength, int shapeWidth){
        this.length = shapeLength;
        this.width = shapeWidth;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}
