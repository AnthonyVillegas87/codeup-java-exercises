package languages;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;

    protected String wordOrder;

    Language(String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equitorial Guinea", "subject-verb-object");
        spanish.getInfo();

        Mayan chuj = new Mayan("Chuj", 2330000);
        chuj.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 111000000);
        mandarin.getInfo();


        SinoTibetan burmese = new SinoTibetan("Burmese", 430000000);
        burmese.getInfo();

    }


}
