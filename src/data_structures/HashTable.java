package data_structures;

public class HashTable {
    // Hash Tables
    // THEY EXIST TO PROVIDE SPEEDY RETRIEVAL OF DATA

    private Employee[] hashTable;

    public HashTable() {
        hashTable = new Employee[10];
    }

    //Hash function to take a string & hashing it to an int
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }
    // Function to add keys/value int table
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null) {
            System.out.println("Sorry, an employee exists at position " + hashedKey);
        } else {
            hashTable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printTable() {
      for(int i = 0; i < hashTable.length; i++) {
          System.out.println(hashTable[i]);
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

        HashTable ht = new HashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith); // Intentional Collision

       // ht.printTable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
    }

}
