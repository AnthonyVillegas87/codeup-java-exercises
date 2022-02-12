import java.util.Arrays;
import java.util.List;

public class JavaDrills {

    public static String flipOuterCase(String text) {
        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

//    public static String flipInnerCase(String string) {
//        char[] chars = string.toCharArray();
//        for(int i = 1; i < chars.length - 1; i++) {
//            if((String.valueOf(chars))) {
//
//            }
//        }
//    }


//    public static List<Integer> returnTotalDifference(List<Integer> one, List<Integer> two) {
//
//       one.stream().mapToInt(Integer::intValue).sum();
//
//        two.stream().mapToInt(Integer::intValue).sum();
//    }


    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat")); //CaT
        System.out.println(flipOuterCase("CaT"));//cat
        System.out.println(flipOuterCase("caT"));//Cat
        System.out.println(flipOuterCase("cAt"));//CAT
    }

}
