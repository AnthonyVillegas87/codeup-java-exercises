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

    public static ArrayList<String> getGroceryList() {
        return groceryList;
    }

    // PRINT THE ITEMS
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }



    // MODIFY/UPDATE A LIST OF GROCERIES
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }


    // REMOVE THE ITEMS FROM THE LIST
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    // CHECK IF WE HAVE ITEMS IN OUR LIST
    private int findItem(String searchItem) {
     //   boolean exists = groceryList.contains(searchItem);

        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }

        return false;
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
