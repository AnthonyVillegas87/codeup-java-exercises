package oop;

public class MotorBikeTest {


    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(0);
        ducati.start();
        MotorBike honda = new MotorBike(0);
        honda.start();


      ducati.setSpeed(80);
      ducati.increaseSpeed(100);
        System.out.println(ducati.getSpeed());
        ducati.decreaseSpeed(25);
        System.out.println(ducati.getSpeed());

      honda.setSpeed(100);
        //System.out.println(honda.getSpeed());
    }
}
