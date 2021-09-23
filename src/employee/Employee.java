package employee;

public class Employee {
    public String name;
    public static String company = "Veridian Dynamics";

    public void displayEmployeeInfo(){
        System.out.println(name + " works at " + company);
    }

    public void quothTheEmployee() {
        System.out.println(name + " says ");
    }



}
