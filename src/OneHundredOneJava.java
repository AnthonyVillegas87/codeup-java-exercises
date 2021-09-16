public class OneHundredOneJava {

//    1. Create a method, returnHelloWorld, that returns the string "Hello World"
        public String returnHelloWorld() {
            return "Hello World";
        }

//            2. Create a method, addInts, that takes in two integers and returns their sum

        public int addInts(int x, int y) {
            return x + y;
        }

//3. Create a method, intToLong, that takes in an integer and returns the same number as a long data type

        public long intToLong(int z) {
            return z;
        }

//4. Create a method numericStringToDouble that takes in a numeric string and
//    returns the number value as a double.

    public double numericStringToDouble(String num) {
            return Integer.parseInt(num);
    }

//     5. Create a method, doubleToFloat, that takes in a double and returns the number as a float.
//      Assume that the input values will fit within a double data type.
    public float doubleToFloat(double num) {
            return (float) num;
    }
//6. Create a method, firstChar, that takes in a string and returns the first character of the string.
    public String firstChar(String str) {
            return String.valueOf(str.charAt(0));
    }
//7. Create a method, lastChar, that takes in a string and returns the last character of the string.

    public String lastChar(String myStr) {
            return String.valueOf(myStr.charAt(myStr.length() - 1));
    }

//8. Create a method, capFirst, that takes in a string and returns the string with the first letter capitalized and all other letters in lowercase.
//
//            9. Create a method, sameFirstAndLast, that takes in a string and returns true if the first and last character match (not case sensitive).
//
//            10. Create a method, sameCase, that takes in two strings. Assume both strings are the same length and only contain letters. The method should return true if both strings share the same sequence letter case.
//
//            11. Create a method, combineChars, that takes in two char inputs and returns a string combining them in numeric/alphabetical order. If a combination of a letter and number, the number will come first.
//
//            12. Create a method, containsSumOfFour, that takes in a string containing any sequence of letters and numbers. If all numbers in the string add up to four, return true, otherwise, return false.
//
//            13. Create a method, isPrime, that takes in a positive integer and returns if the integer is a prime number.
//
//            14. Create a method, nextPrime, that takes in a positive integer and returns the next highest prime number.
//
//15. Create a method, lowerPrime, that takes in a positive integer and returns the closest prime number less than the input. If passed one, the method should return 1.
//
//            16. Create a method, letterToNumber, that takes in a char letter and returns byte which represents the order in which the letter appears in the alphabet. Upper and lower case versions of the same letter should return the same number.
//
//17. Create a method, lettersToNumber, that takes in a series of letters and numbers and returns a long that combines the number ordering of letters with any existing numbers into a larger long number.
//
//            18. Create a method, isPalindrome, and returns true if the passed string input is identical forwards and backwards. This method should be case sensitive.
//
//19. Using overloading, create several methods called combine, that will return the sum of two integers, the product of two bytes, the concatenation of two chars, the longer string of two strings, and the result of two booleans combined with an AND logical operator.
//
//20. Create a method, returnLongerArray, that takes in two arrays of integers and returns the longest array.
//
//            21. Create a method, oneMore, that takes in two inputs, an array of integers and a single integer. The method will return another array of integers with the same values of the first array and an additional integer element of the second input.
//
//22. Create a method, javaPop, that takes in an array of any primitive type and returns the same array of that datatype with the last element removed. Method overloading will be needed. If only one element is present, return an empty array.
//
//23. Create a method, javaShift, that takes in an array of any primitive data type and returns the the array with the first element removed. Method overloading will be needed. If only one element is present, return an empty array.
//
//24. Create a method, stringToCharArray, that takes in a string and returns the characters of the string as an array.
//
//25. Create a method, sumInts, that takes in an array of integers and returns the sum of all integers.
//
//            26. Create a method, remove7s, that takes in a list of integers and removes any number sevens and returns the list.
//
//            27. Create a method, intArrayToArrayList, that takes in an array of integers and returns an array list of integers.
//
//            28. Create a method, listsToMap, that takes in to arraylists of the same length and creates a hashmap with keys matching the first arraylist, set to values matching the second arraylist.
//
//29. Create a method, sameMapValues, that takes in a hashmap and returns true if any keys have matching values, and false if all keys have unique values. Assume the hash map has string keys and integer values.
//
//            30. Create a method, concatTwoMapValues, that takes in three inputs total: a hashmap with string keys and string inputs, and two string inputs. The method will return the concatenation of the values of hash map at the keys that match with the string inputs. If no key is found on the hash map matching with one or both of the passed in string inputs, an empty string will be concatentated.
//
//31. Create a method, getStringInfo, that takes in a string and returns a hashmap with the following keys:
//            "length" - containing the length of the passed in string
//  "noOfCs" - containing the number of c's in the pass in string (case insensitive)
//            "indexOfFirstVowel" - containing the index number within the string of the first vowel
//
//32. Create a method, reverseValues, that takes in an arraylist of string values and returns the arraylist with each string in reverse-order
//
//33. Create a method, progressUpMusicKeys, that takes in a letter char and an integer number of how many keys up or down from a given a "key"/"note" the output letter char will be. The musical alphabet is made of the letters A-G. One letter below A will be G. One letter above G will be A.
//
//34. Create a method, hashKeysToList, that takes in a hash map and returns the keys of the map as an array list in alphabetical order.
//
//            35. Create a method, intToByte, that takes in an integer and returns the value as a byte. If the byte value is not the same as the integer due to overflow, throw a custom exception called ValueMismatchException. The exception should extend from exception and should not be handled by a try catch in the method.
//
//36. Create a method, generateFibonacciSequence, that takes in an integer and returns the the Fibonacci sequence up to the passed in input.
//
//37. Create a method, returnHalveTheInput, that takes in an integer and returns halve the value as a double.
//
//            38. Create a method, returnUniqueValues, that takes in two arraylists of integers and returns only integers that do not appear anywhere in both lists.
//
//            39. Create a method, weaveList, that takes in two arraylists of Character letters and returns an arraylist of Character letters of that alternate between the indexes of the first and second arraylist. If one arraylist is longer that another, the remaining letters of the longer list will continue to add to the end of the output arraylist.
//
//40. Create a method with a void return type, soutCadence, that takes in a hashmap of string keys and integer values. The method should sout out the name of each key in the hashmap after the number of milliseconds stored as the value at a given key.
//
//            --------------------------------- The next sets of problems, will require creating and adding to two new classes:
//
//            40 - 60 : instance methods
//
//  40 - 50 : Product, Store classes
//
//
//
//40. Create a class, Product, with following...
//
//            - private instance properties...
//
//    productId (long),
//    name (string),
//    type (string),
//    description (string),
//    priceInCents (long),
//    onClearence (boolean, indicating a 10% discount off the priceInCents),
//    soldOn (date)
//
//  - public getters and setters for all properties
//
//  - a constructor that sets all properties
//
//41. Create a class, Store, with the following...
//
//            - private instance properties...
//
//    name (string)
//    description (string)
//    dateOfFirstSale (date)
//    dateOfMostRecentSale (date)
//    inventory (hashmap with keys for various product names with arraylist values of the type Product)
//
//  - public getters and setters for all properties
//
//  - a constructor setting the values for all properties
//
//
//42. Add an instance method to the Store class, addProductToInventory, that adds a key and arraylist for a new product name and appends to an existing list if the key already exists in the inventory.
//
//42. Add an instance method to the Store class, removeProductFromInventory, that adds a key and arraylist for a new product name and appends to an existing list if the key already exists in the inventory.
//
//43. Add an instance method to the Store class, getProductById, that searches the correct list at a given product name matching key in the inventory hash map for a product matching a given id and returns this product object.
//
//            44. Add an instance method to the Store class, sellProduct, that takes in a product id and sets soldOn date to todays date and updates the dateOfMostRecentSale property on the Store object.
//
//            45. Add an instance method to the Store class, sellProducts, that takes in an arraylist of product ids and sets the soldOn property to todays date and the dateOfMostRecentSale property on the Store class.
//
//            46. Add an instance method to the Store class, getProductCount, that returns the count of all named products as a hash map with keys matching the name of each key in the inventory hash map and values of integers that correspond to how many products are currently in the inventory.
//
//            47. Add an instance method to the Store class, activateClearanceDiscount, that takes in the name and id of a product and activates the discount in the inventory product.
//
//            48 Add an instance method to the Store class, getSoldProducts, that returns a hash map of products with only the products with a soldOn date value that is not null.
//
//            49. Add an instance method to the Store class, getItemsSoldToday, that returns a list of products from the inventory of all products sold today.
//
//            50. Add an instance method to the Store class, getListOfTypes, that takes in a name of an inventory key and returns all unique types of products that match the product name.
//
//51. Add an instance method to the Store class, getMostExpensiveProducts, that returns a list of products with the most expensive price. If only one item has the highest price, the list will only contain the single product. If their are many products that share the same high price, the list will contain all of these products.
//
//            52. Add an instance method to the Store class, mapToList, that returns all products in the inventory hash map as a single arraylist of products.
//
//53. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListByPrice, that returns the inventory of products as a list of products sorted by price, lowest to highest.
//
//            54. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListByName, that returns the inventory of products as a list of products sorted by name alphabetically.
//
//54. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListById, that returns the inventory of products as a list of products sorted by the product id, lowest to highest.
//
//            54. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListSoldDate, that returns the inventory of products as a list sorted chronologically by the sortOn date.
//
//55. Add an instance method to the Store class, getClearenceMetrics, that returns information about the inventory products sold as a hash map, with a key for "numberOfItemsSoldOnClearence" and "numberOfItemsSold".
//
//            56. Add an instance method to the Store class, getLongestDescription, that returns the longest product description from the inventory hash map as a string.
//
//            57. Add an instance method to the Store class, setClearenceForExpensiveProducts, that sets the onClearence property to true for all products in the inventory that have not been sold yet and are more expensive than $100.00.
//
//            57. Add an instance method to the Store class, invokeNaturalDisaster, that removes randomly anywhere from one to three unsold products from each key of the hashmap. If the list value at a given key does not have enough items to be removed by the randomly generated number, remove all remaining unsold products at that given key.
//
//58. Add an instance method to the Store class, getAllTypes, that returns all unique product types from the inventory as an arraylist, sorted in alphabetical order.
//
//59. Add an instance method to the Store class, downsizeInventory, that drops the names of all products in the inventory except the name of the product that has the most sold products.
//
//            60. Add a static method to the Store class, getTopStore, that takes in a list of store instances and returns the store with the most the highest ratio of sold items to total number of products in their inventories.
//
//
//--------------------------------- The next sets of problems will require creating and adding to three new classes:
//
//            61. Create an abstract class, Customer, with following:
//
//            - private properties:
//
//    name (string)
//    customerId (long)
//    dateOfFirstTransaction (date)
//    dateOfMostRecentTransaction (date)
//    numberOfTransactions (date)
//    totalAmountSpentInCents (long)
//    numberOfComplaintsCreated (long)
//    numberOfOffenses (long)
//    isBanned (boolean)
//    isCurrentCustomer (boolean)
//
//
//  - public getters and setters
//
//  - contructor that sets all properties
//
//  - abstract methods
//
//            calculateCustomerValue
//    calculateSolicitationFrequency
//            updateBanStatus
//    updateActiveStatus
//            registerNewTransaction
//
//62. Create Patient class that extends from Customer
//
//63. Create Shopper class that extends from Customer
//
//64. Create StreamingSubscriber class that extends from Customer
//
//65. Implement calculateCustomerValue in Patient class
//
//66. Implement calculateCustomerValue in Shopper class
//
//67. Implement calculateCustomerValue in StreamingSubscriber class
//
//68. Implement calculateSolicitationFrequency in Patient class
//
//69. Implement calculateSolicitationFrequency in Shopper class
//
//70. Implement calculateSolicitationFrequency in StreamingSubscriber class
//
//71. Implement updateBanStatus in Patient class
//
//72. Implement updateBanStatus in Shopper class
//
//73. Implement updateBanStatus in StreamingSubscriber class
//
//74. Implement updateActiveStatus in Patient class
//
//75. Implement updateActiveStatus in Shopper class
//
//76. Implement updateActiveStatus in StreamingSubscriber class
//
//77. Implement registerNewTransaction in Patient class
//
//78. Implement registerNewTransaction in Shopper class
//
//79. Implement registerNewTransaction in StreamingSubscriber class
//
//80. Create a class, CustomerMetrics, and add a static method, getAverageCustomer value, that takes in an arraylist of customers of various types and returns the average of all customerValues.
//


}
