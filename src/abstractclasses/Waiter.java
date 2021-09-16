package abstractclasses;

public class Waiter extends Employee {

    @Override
    public String doWork() {
        return "Serving the guests...";
    }

    public static void employeesWork(Employee[] employees) {
        for(Employee e : employees) {
            System.out.println(e.doWork());
        }
    }
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
//        System.out.println(waiter.doWork());
//        waiter.sayHi();

        Employee developer = new Developer();
        Employee[] employees = {waiter, developer};
        employeesWork(employees);
    }
}
