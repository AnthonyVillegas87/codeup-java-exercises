package employee;

import employee.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee one = new Employee();
        one.name = "One";
        Employee two = new Employee();
        two.name = "Two";
        Employee three = new Employee();
        three.name = "Three";
        three.quothTheEmployee();
    }

}
