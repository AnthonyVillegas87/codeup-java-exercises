package reptile;

public class Lizard {
   public String name;

    Lizard(String name) throws IllegalArgumentException {
        this.name = name;
        if(name == null) {
            throw new IllegalArgumentException();
        }
        System.out.println("This is a " + name);
    }

}
