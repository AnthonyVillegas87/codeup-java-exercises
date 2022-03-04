package data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ArrayLists {
    private static Scanner scanner = new Scanner(System.in);

    /*
    ArrayLists
     */
    private static ArrayList<String> groceryList = new ArrayList<>();

    // ADD A GROCERY ITEM
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // PRINT THE ITEMS
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // MODIFY/UPDATE A LIST OF GROCERIES
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    // REMOVE THE ITEMS FROM THE LIST
    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    // CHECK IF WE HAVE ITEMS IN OUR LIST
    public String findItem(String searchItem) {
     //   boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;

    }




    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mike", "Wilson", 3244));
        employeeList.add(new Employee("May", "Smith", 223));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 45676));
        employeeList.forEach(System.out::println);

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("May", "Smith", 223)));

        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 45676)));

        employeeList.remove(2);
        employeeList.forEach(System.out::println);

    }

}
