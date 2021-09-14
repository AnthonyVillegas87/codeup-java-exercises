package birds;

public class BirdShelterTest {
    public static void main(String[] args) {


        //Polymorphic Array
        Bird[] birds = new Bird[3];
        birds[0] = new Eagle();
        birds[0].setName("New Bald Eagle");
        birds[1] = new Duck();
        birds[1].setName("Mallard");
        birds[2] = new Penguin();
        birds[2].setName("Emperor Penguin");

       BirdShelter healedWings = new BirdShelter();
       healedWings.shelterNoise(birds);

       healedWings.birdCare(birds[1]);
    }
}
