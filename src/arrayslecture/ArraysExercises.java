package arrayslecture;

import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] people, Person newPeople) {
        Person[] person = Arrays.copyOf(people, people.length + 1);
        person[person.length - 1] = newPeople;
        return person;
    }



    public static void main(String[] args) {
//        person.Person[] people = {
//                new person.Person("OJ"),
//                new person.Person("Chris"),
//                new person.Person("Noah")
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
