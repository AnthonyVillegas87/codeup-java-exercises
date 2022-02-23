package data_structures;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Iterator;
import java.util.LinkedList;

public class DoublyLinkedList {


    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    /// ========================================= ADD BEFORE
    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        if(head == null) {
            return false;
        }

        // find existing employee
        EmployeeNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }
         if(current == null) {
             return false;
         }

         EmployeeNode newNode = new EmployeeNode(newEmployee);
         newNode.setPrevious(current.getPrevious());
         newNode.setNext(current);

         current.setPrevious(newNode);
         if(head == current) {
             head = newNode;
         } else {
             newNode.getPrevious().setNext(newNode);
         }

         size++;

        return true;
    }


    /// ==========================================     REMOVING FROM FRONT OF LIST
    public void removeFromFront() {
        if(isEmpty()) return;

        EmployeeNode removedNode = head;

        if(head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
    }

    /// ==========================================     ADDING TO FRONT OF LIST
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if(head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }


    /// ==========================================     ADDING TO END OF LIST
    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /// ==========================================     REMOVING FROM END OF LIST
    public EmployeeNode removeFromEnd() {
        if(isEmpty()) return null;


        EmployeeNode removedNode = tail;
        if(tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;

    }




    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        while(current != null) {
            System.out.println(current);
            System.out.println(" < = > ");
            current = current.getNext();
        }
        System.out.println("null");
    }








    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 223);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        DoublyLinkedList list = new DoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

//        System.out.println(list.getSize());


        list.addBefore(billEnd, johnDoe);
        list.printList();
//        list.addToEnd(billEnd);

        list.addBefore(new Employee("New", "Guy", 2517), mikeWilson);
        list.printList();

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());



        Employee mikeJones = new Employee("Mike", "Jones", 2005);
        Employee slimThug = new Employee("Slim", "Thug", 2006);
        Employee snoopDogg = new Employee("Snoop", "Dogg", 1995);
        Employee tupac = new Employee("Tupac", "Shakur", 1993);
        Employee notorious = new Employee("Notorious", "B.I.G", 1993);

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(mikeJones);
        linkedList.addFirst(slimThug);
        linkedList.addFirst(snoopDogg);
        linkedList.addFirst(tupac);


        Iterator iter = linkedList.iterator();
        System.out.println("HEAD -> ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println(" < = > ");
        }
        System.out.println("null");

        linkedList.add(notorious);
        iter = linkedList.iterator();
        System.out.println("HEAD -> ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println(" < = > ");
        }
        System.out.println("null");

        linkedList.removeFirst();
        iter = linkedList.iterator();
        System.out.println("HEAD -> ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println(" < = > ");
        }
        System.out.println("null");

        linkedList.removeLast();
        iter = linkedList.iterator();
        System.out.println("HEAD -> ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println(" < = > ");
        }
        System.out.println("null");



    }

}
