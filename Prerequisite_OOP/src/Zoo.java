public class Zoo {
    // Driver class to check Inheritance & Polymorphism
    public static void main(String[] args) {
        //Create objects
        Animal animal1 = new Dog("Hugo", 3);
        Animal animal2 = new Bird("Jack", 2);

        /* Access the properties & methods of the super class. Inheritance achieved */
        System.out.println("Dog object: " + animal1.getClass());
        animal1.display();

        /* Override the makeSound method of the Animal class. Polymorphism achieved*/
        animal1.makeSound();


        System.out.println("Bird object: " + animal2.getClass());
        animal2.display();

        animal2.makeSound();
    }


}
