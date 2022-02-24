package data_structures;

public class Stack {
    /*
    * Abstract data type
    * LIFO - Last In First Out
    * push - adds an item as the top item on the stack
    * pop - removes the top item on the stack
    * peek - gets the top item on the stack w/o popping it
    * Ideal backing data structure: LINKED LIST!!!
    *
    * Time Complexity:
    * O(1) for push, pop, and peek when using a LINKED LIST
    * If using an ARRAY O(N), because it may need resizing
    *
    * LINKED LIST IDEAL!!!!
    *
     */

    public static void main(String[] args) {
        //==========  Implementation 1 ARRAYS
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        //stack.printStack();

        System.out.println(stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());


    }



}