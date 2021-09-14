package birds;

public class BirdShelter {


    public void shelterNoise(Bird[] shelteredBirds) {
        for(Bird bird : shelteredBirds) {
            System.out.println(bird.getName() + " says ");
            bird.makeNoise();
        }
    }

    public void birdCare(Bird healedBird) {
        healedBird.makeNoise();
    }




}
