package data_structures;


public class SinglyLinkedList {

    private EmployeeNode head;
    private int size;

    public void removeFromFront() {
        if(isEmpty()) return;

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        while(current != null) {
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {



        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 223);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }



}
