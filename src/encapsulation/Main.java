package encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Red XIII", 50, "magic");
        System.out.println("Initial health for " + player.getFullName() + " = " + player.getHitPoints());
    }
}
