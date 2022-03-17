package data_structures;

class StoredEmployee {

public String key;
public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}





public class SimpleHashTable {
    // Hash Tables
    // THEY EXIST TO PROVIDE SPEEDY RETRIEVAL OF DATA

    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    //Hash function to take a string & hashing it to an int
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }
    // Function to add keys/value int table
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if(hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }


        if(occupied(hashedKey)) {
            System.out.println("Sorry, an employee exists at position " + hashedKey);
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if(hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null &&
            hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }


        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

       if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
           return hashedKey;
       } else {
           return -1;
       }


    }

    public void printTable() {
      for(int i = 0; i < hashTable.length; i++) {
          if (hashTable[i] == null) {
              System.out.println("Empty");
          } else {
              System.out.println("Position " + i + ": " + hashTable[i].employee);
          }

      }
    }

    /*
    * Abstract data type
    * Provide access to data using keys
    * Key doesn't have to be an integer
    * Consists of key/value pairs - data types don't have to match
    * Optimized for retrieval (when you know the key)
    * Associative array is one type of hash table
     */

    // Linear Probing ========  Collision Handling Solution 1 : Open Addressing
    private boolean occupied(int index) {
        return hashTable[index] != null;

    }
    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;
        return employee;
    }

    /*
    // Hashing
    * Maps keys of any data type to an integer
    * Hash function maps keys to int
    * In java, hash function is Object.hashCode()
    * Collision occurs when more than one value has the same hashed value

    // Load Factor
    * Tells us how full a hash table is
    * Load factor = # of items / capacity = size / capacity
    * Load factor is used to decide when to resize the array backing the hash table
    * Don't want load factor too low (a lot of empty space)
    * Don't want load factor too high (will increase the likelihood of collisions)
    * Can't play a role in determining the time complexity for retrieval

    //====== Add to Hash Table backed by an array
    * Provide a key/value pair
    * Use a hash function to hash the key to an int value
    * Store the value at the hashed key value - this is the index into the array
     */

    public static void main(String[] args) {

        // UNDER THE HOOD IMPLEMENTATION  =======  THIS IS NOT S.O.P
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 223);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith); // Intentional Collision

        ht.printTable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printTable();
    }

}
