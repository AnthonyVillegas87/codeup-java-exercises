package abstractclasses;

public abstract class StringTransformer {

    protected String str;

    public StringTransformer(String myString) {
        this.str = myString;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public abstract String transform();
}
