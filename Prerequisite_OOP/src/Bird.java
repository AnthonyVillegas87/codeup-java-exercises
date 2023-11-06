class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp! Chirp!!");
    }



}
