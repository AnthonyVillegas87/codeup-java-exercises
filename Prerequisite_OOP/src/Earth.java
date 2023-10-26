public class Earth {

    public static void main(String[] args) {
        Human jason = new Human();
        jason.age = 36;
        jason.eyeColor = "blue";
        jason.heightInInches = 72;
        jason.name = "Jason Mac";
        jason.speak();
        System.out.println(".........");
        Human ray = new Human();
        ray.name = "Ray";
        ray.eyeColor = "brown";
        ray.age = 33;
        ray.heightInInches = 82;
        ray.speak();
    }

}
