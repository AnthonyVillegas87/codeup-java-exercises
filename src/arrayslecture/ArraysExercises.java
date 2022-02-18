package arrayslecture;

import java.util.Arrays;


import java.util.ArrayList;
import java.util.List;
public class ArraysExercises {


    public static Person[] addPerson(Person[] people, Person newPeople) {
        Person[] person = Arrays.copyOf(people, people.length + 1);
        person[person.length - 1] = newPeople;
        return person;
    }



    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = 15;
        intArray[3] = 21;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for(int i = 0; i < intArray.length; i++) {
           if(intArray[i] == 55) {
               index = i;
               break;
           }
        }
        System.out.println(index);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(13);
//        numbers.add(new Integer(8)); // Line 7
//        numbers.add(3.6); // Line 8
//        for (Integer number: numbers) System.out.println(number); // Line 9


        String[] names = {"James Gosling", "Mike Sheridan", "Patrick Naughton"};
        for (String name : names)
            System.out.println(name);




//        Person[] people = {
//                new Person("OJ"),
//                new Person("Chris"),
//                new Person("Noah")
//        };
//
//        for(int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName());
//        }
//
//
//
//        int[] numbers = {1, 2, 3, 4, 5};

    }

}
