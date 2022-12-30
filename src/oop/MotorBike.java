package oop;

public class MotorBike {
   private int speed;


   MotorBike() {
       this(5);
   }
    MotorBike(int speed) {
        this.speed = speed;
    }

   int getSpeed() {
       return this.speed;
   }
    void setSpeed(int speed) {
       if(speed > 0) {
           this.speed = speed;
       }

    }
    void start() {
        System.out.println("vrooom");
    }

    public void increaseSpeed(int amount) {
       setSpeed(this.speed = this.speed + amount);
    }

    public void decreaseSpeed(int amount) {
       setSpeed(this.speed = this.speed - amount);
    }

}
