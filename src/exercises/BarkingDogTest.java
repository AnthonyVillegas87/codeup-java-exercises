package exercises;

import static exercises.BarkingDog.shouldWakeUp;

public class BarkingDogTest {

    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, 1);
        System.out.println(wakeUp);

       wakeUp = shouldWakeUp(true, 8);
        System.out.println(wakeUp);

        wakeUp = shouldWakeUp(true, -1);
        System.out.println(wakeUp);

    }
}
