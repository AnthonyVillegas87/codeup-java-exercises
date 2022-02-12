package primitives;

public class CharAndBoolean {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        ///============  Primitive Types
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        ///==============  String - which is actually a class
        String myString = " String";
        System.out.println("Say hello to my little " + myString);
        System.out.println(myString + myCopyrightChar);

        String lastString = "10";
        int myInt = 50;

        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
