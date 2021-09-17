package abstractclasses;



public class ReverseStringTransformer extends StringTransformer{

    ReverseStringTransformer(String strToo) {
        super(strToo);
    }

    @Override
    public String transform() {
        return  "World";
    }


}
