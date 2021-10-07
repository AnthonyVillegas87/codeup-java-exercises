package employee;

public class Person extends Employee{
    private String department;
    public Person(String name, String department) {
        super(name);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}
