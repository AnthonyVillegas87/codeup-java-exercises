public class FighterTest {

    public static void main(String[] args) {
        Fighter arata = new Fighter("Arata", 17, 14);
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
        arata.battleRoar();


        Fighter knowlan = new Fighter("Knowlan", 24, 16);
//        knowlan.name = "Knowlan";
        knowlan.battleRoar();
//        knowlan.printStats();
        System.out.println("Knowlan attacks with a hit of " + knowlan.attackRoll() + " points.");
    }

}
