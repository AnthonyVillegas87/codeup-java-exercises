package abstractclasses;

public class Waiter extends Employee {

    @Override
    public String doWork() {
        return "Serving the guests...";
    }


    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        System.out.println(waiter.doWork());
        waiter.sayHi();
    }
}
