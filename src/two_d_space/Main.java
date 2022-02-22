package two_d_space;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(6, 5);
        Point b = new Point(3, 1);
        System.out.println("(0, 0) = " + a.distance());
        System.out.println("(b) = " + a.distance(b));
    }
}
