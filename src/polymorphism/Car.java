package polymorphism;



public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int numberOfCylinders, String name) {
        this.cylinders = numberOfCylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;

    }


    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car -> start engine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake";
    }


    public static void main(String[] args) {








    }




     class Holden extends Car {
        public Holden(int numberOfCylinders, String name) {
            super(numberOfCylinders, name);
        }

        @Override
        public String startEngine() {
            return "Holden -> start engine()";
        }

        @Override
        public String accelerate() {
            return "Holden -> accelerate()";
        }

        @Override
        public String brake() {
            return "Holden -> brake()";
        }
    }

    class Ford extends Car {
        public Ford(int numberOfCylinders, String name) {
            super(numberOfCylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford -> start engine()";
        }

        @Override
        public String accelerate() {
            return "Ford -> accelerate()";
        }

        @Override
        public String brake() {
            return "Ford -> brake()";
        }
    }

    class Mitsubishi extends Car {
        public Mitsubishi(int numberOfCylinders, String name) {
            super(numberOfCylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi -> start engine()";
        }

        @Override
        public String accelerate() {
            return "Mitsubishi -> accelerate()";
        }

        @Override
        public String brake() {
            return "Mitsubishi -> brake()";
        }
    }
}
