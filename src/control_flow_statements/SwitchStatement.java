package control_flow_statements;

import jdk.swing.interop.SwingInterOpUtils;

public class SwitchStatement {


    public static void main(String[] args) {

        int switchValue = 4;

        switch (switchValue) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("neither");
        }

        char character = 'G';

        switch(character) {
            case 'A', 'B' , 'C', 'D', 'E' -> System.out.println("Letter " + character);
            default -> System.out.println("Could not find a letter");

        }



    }
}
