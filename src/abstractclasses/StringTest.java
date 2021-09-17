package abstractclasses;
import java.lang.*;
import java.io.*;
import java.util.*;
public class StringTest {

    public static void main(String[] args) {
        StringTransformer hello = new UpperCaseStringTransformer("Hello");
        StringTransformer world = new ReverseStringTransformer("World");

        String[] string = new String[2];
        string[0] = hello.getStr();
        string[1] = world.getStr();

       for(String s : string) {
            string.append(s.charAt(i));
       }
    }
}
