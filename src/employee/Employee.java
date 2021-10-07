package employee;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static String company = "Veridian Dynamics";

    public void displayEmployeeInfo(){
        System.out.println(name + " works at " + company);
    }

    public void quothTheEmployee() {
        System.out.println(name + " says ");
    }



}
