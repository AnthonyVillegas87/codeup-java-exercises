package numbers;

public class BiNumber {
    private int numberOne;
    private int numberTwo;

    BiNumber() {
        this(0, 0);
    }

    BiNumber(int a, int b) {
        this.numberOne = a;
        this.numberTwo = b;
    }

    public int add() {
        return numberOne + numberTwo;
    }

    public int multiply() {
        return numberOne * numberTwo;
    }

    public void doubleValue() {
        this.numberOne *= 2;
        this.numberTwo *= 2;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
}
