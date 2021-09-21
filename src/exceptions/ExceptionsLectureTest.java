package exceptions;

public class ExceptionsLectureTest {

    public static void main(String[] args) {



        try {
            ExceptionsLecture el = new ExceptionsLecture();
            el.subListMaker("sentence");
        } catch(IndexOutOfBoundsException nfx) {
            System.out.println("Got an exception " + nfx);
        } catch(NullPointerException npe) {
            System.out.println("This is " + npe);
        } catch (IllegalArgumentException iae) {
            System.out.println("This is: " + iae);
        }

//        el.askForInt();
//        try {
//
//            System.out.println(Integer.parseInt(el.noInt));
//        } catch(NumberFormatException nfx) {
////            System.out.println("Got an exception " + nfx);
////            System.out.println(nfx.getMessage());
//            nfx.printStackTrace();
//        }


//        try {
//          String myString = "Java docs";;
//        System.out.println(myString.substring( 10));
//        } catch(IndexOutOfBoundsException nfx) {
//            System.out.println("Got an exception " + nfx);
//            System.out.println(nfx.getMessage());
//        }

    }
}
