package abstractclasses;

public class MediaTest {

    public static void main(String[] args) {
        Media history = new History();
        Media.primarySource();
        history.fieldSource();

        Media data = new DataTheory();
        Media.primarySource();
        data.fieldSource();
    }
}
