package scope;

public class Main {


    public static void main(String[] args) {
        String intFour = "This is private to main()";

        ScopeCheck instance = new ScopeCheck();
        instance.useInner();

        ScopeCheck.InnerClass innerClass = instance.new InnerClass();
//        System.out.println("intThree is not available here " + innerClass.intThree);
//        System.out.println("scopeInstance created, intOne is " + instance.getIntOne());
//        System.out.println(intFour);
//
//        instance.timesTwo();
//        System.out.println("***************************");
//        ScopeCheck.InnerClass innerClass = instance.new InnerClass();
//        innerClass.timesTwo();
    }

}
