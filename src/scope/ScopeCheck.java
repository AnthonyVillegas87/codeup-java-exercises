package scope;

public class ScopeCheck {

    public int publicInt = 0;
    private int privateInt = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicInt = " + publicInt + ": privateInt = " + privateInt);
    }

    public int getPrivateInt() {
        return privateInt;
    }

    public void timesTwo() {
        int privateInt = 2;
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateInt);
        }
    }

    public class InnerClass {
        public int privateInt = 3;

        public InnerClass() {
            System.out.println("Inner Class created, privateInt is " + privateInt);
        }

        public void timesTwo() {
            ScopeCheck.this.timesTwo();
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateInt);
            }
        }
    }

}
