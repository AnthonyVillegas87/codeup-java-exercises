package scope;

public class Main {


    public static void main(String[] args) {
        String privateInt = "This is private to main()";

        ScopeCheck instance = new ScopeCheck();
        System.out.println("scopeInstance created, privateInt is " + instance.getPrivateInt());
        System.out.println(privateInt);

        instance.timesTwo();
        System.out.println("***************************");
        ScopeCheck.InnerClass innerClass = instance.new InnerClass();
        innerClass.timesTwo();
    }

}
