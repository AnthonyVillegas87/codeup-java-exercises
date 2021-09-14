public class ServerNameGenerator {
    static String[] adjectives = {"Brave", "Calm", "Careful", "Clever", "Clear", "Busy", "Charming", "Bright", "Cautious", "Breakable"};
    static String[] nouns = {"Account", "Cloth", "Discussion", "Fold", "Fire", "Flight", "Kick", "Land", "Iron", "Join"};

    public static String randomGenerator(String[] array) {
        return array[(int)(Math.random() * array.length)];
    }

    public static void main(String[] args) {
        System.out.println(randomGenerator(nouns) + randomGenerator(adjectives));
    }

}
