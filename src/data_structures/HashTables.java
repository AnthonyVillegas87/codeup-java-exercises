package data_structures;

public class HashTables {
    // Hash Tables
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


}
