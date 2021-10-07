package employee;

import employee.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

//        Person emp = new Person("Peter Gibbons", "IT");
//        System.out.println(emp.getName() + " works in " + emp.getDepartment());

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }

//        Employee one = new Employee();
//        one.name = "One";
//        Employee two = new Employee();
//        two.name = "Two";
//        Employee three = new Employee();
//        three.name = "Three";
//        three.quothTheEmployee();
    }

}
