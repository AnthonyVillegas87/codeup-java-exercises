package data_structures;


import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashTable;

    // ========== Collision Handling Solution 2 : Chaining
    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }
    // PUT data into table
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));
    }

    // RETRIEVE data from the table
    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;

        while(iterator.hasNext()) {
            employee = iterator.next();
            if(employee.key.equals(key)) {
                return employee.employee;
            }
        }

        return null;
    }


    // REMOVING data from the table
    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;

        int index = -1;
        while(iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if(employee.key.equals(key)) {
                break;
            }
        }

        if (employee == null) {
            return null;
        } else {
           hashTable[hashedKey].remove(index);
           return employee.employee;
        }

    }


    //Hash function to take a string & hashing it to an int
    private int hashKey(String key) {
        //return key.length() % hashTable.length;

        // IN A HASHING FUNCTION YOU ARE ALWAYS GOING TO BE MODING IT BY THE SIZE OF THE ARRAY
        // REASON: THE VALUE YOU RETURN ARE VALID ARRAY INDICES
        return Math.abs(key.hashCode()) % hashTable.length;
    }

    // Print / Show table
    public void printTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if(hashTable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.println(" -> ");
                }
                System.out.println("null");
            }

        }
    }


    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 223);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith); // Intentional Collision

        ht.printTable();

//       System.out.println("Retrieve key Smith: " + ht.get("Smith"));
//
//        ht.remove("Doe");
//        ht.remove("Jones");
//        ht.printTable();
//
//        System.out.println("Retrieve key Smith: " + ht.get("Smith"));


    }
}
