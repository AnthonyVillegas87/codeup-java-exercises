package languages;

public class SinoTibetan extends Language{
    SinoTibetan(String langName, int numSpeakers) {
        super(langName, numSpeakers, "Asia", "subject-object-verb");
        if(langName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }

    }
}
