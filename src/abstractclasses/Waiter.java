package abstractclasses;

public class Waiter extends Employee implements Transferable{

    @Override
    public String doWork() {
        return "Serving the guests...";
    }

    @Override
    public void transferToNewLocation(String location) {
        System.out.println("Moving to " + location);
    }

    @Override
    public String[] getListOfPossibleTransfers() {
        return new String[] {"location1", "location2"};
    }



    public static void employeesWork(Employee[] employees) {
        for(Employee e : employees) {
            System.out.println(e.doWork());
        }
    }
    public static void main(String[] args) {
//        Waiter waiter = new Waiter();
//        System.out.println(waiter.doWork());
//        waiter.sayHi();
        Transferable waiter = new Waiter();
        waiter.transferToNewLocation("San Antonio");
//        employee.Employee developer = new Developer();
//        employee.Employee[] employees = {waiter, developer};
//        employeesWork(employees);
    }
}
