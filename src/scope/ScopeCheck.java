package scope;

public class ScopeCheck {

    public int publicInt = 0;
    private int intOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicInt = " + publicInt + ": privateInt = " + intOne);
    }

    public int getIntOne() {
        return intOne;
    }

    public void timesTwo() {
        int intTwo = 2;
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * intTwo);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("intThree from our outer class: " + innerClass.intThree);
    }

    public class InnerClass {
        private int intThree = 3;

        public InnerClass() {
            System.out.println("Inner Class created, intOne is "  + intOne + " and intThree is " + intThree);
        }

        public void timesTwo() {
            System.out.println("intOne is still available here " + intOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * intThree);
            }
        }
    }

}
