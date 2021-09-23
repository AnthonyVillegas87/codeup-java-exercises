package methods;

public class MethodWarmup {




    public static double getDifference(int x, int y) {
        if(y > x) return y - x;
        if(x == 0 || y == 0) return x;

        return x - y;
    }





    public static void main(String[] args) {
       String str = "8" + 1;
       System.out.println(str);
    }






}
