package abstractclasses;

public class UpperCaseStringTransformer extends StringTransformer{

    UpperCaseStringTransformer(String str) {
        super(str);
    }

    @Override
    public String transform() {
        return "HELLO!";
    }


}
