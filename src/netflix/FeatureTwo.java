package netflix;
import java.util.*;
public class FeatureTwo {
    /* Fetch Top Movies    (Merge K Sorted Lists)*/

    // ======= Description ======== //
    /*
     Now , we need to build a criterion so the top movies from multiple countries will combine
     into a single list of top-rated movies. In order to scale, the content search is
     performed in a distributed fashion. Search results for each country are produced in separate lists.
     Each member of a given list is ranked by popularity, with 1 being most popular and popularity
     decreasing as the rank number increases.

     We'll be given N arrays that are all sorted in ascending order of popularity rank. We
     have to combine these lists into a single list that will be sorted by rank in ascending order,
     meaning from best to worst.

      // ======= Solution =========== //
      Since our task involves multiple lists, you should divide the problem into multiple tasks,
      starting with the problem of combining two lists at a time. Then, you should combine the result of
      those first two lists with the third list, and so on, until the very las one is reached.

       // ======= Implementation ======= //
       1. Consider the first list as the result, and store it in a variable.

       2.Traverse the list of lists, starting from the second list, and combine it with the list we
       stored as a result. The result should get stored in the same variable.

       3. When combining the two lists, like l1 and l2, maintain a prev pointer that points to
       a dummy node.

       4. If the value for list l1 is less than or equal to the value for the list l2, connect the
       previous node to l1 and increment l1. Otherwise, do the same but for list l2.

       5. Keep repeating the above step until one list points to a null value.

       6. Connect the non-null list to the merged one and return.

     */

    static class LinkedListNode {
        public int key;
        public int data;
        public LinkedListNode next;
        public LinkedListNode arbitraryPointer;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public LinkedListNode(int key, int data) {
            this.key = key;
            this.data = data;
            this.next = null;
        }

        public LinkedListNode(int data, LinkedListNode next) {
            this.data = data;
            this.next = next;
        }

        public LinkedListNode(int data, LinkedListNode next, LinkedListNode arbitraryPointer) {
            this.data = data;
            this.next = next;
            this.arbitraryPointer = arbitraryPointer;
        }
    }



    static class LinkedList {

        public static LinkedListNode insertAtHead(LinkedListNode head, int data) {
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.next = head;
            return newNode;
        }

        public static LinkedListNode insertAtTail(LinkedListNode head, int data) {
            LinkedListNode newNode = new LinkedListNode(data);
            if (head == null) {
                return newNode;
            }
            LinkedListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return head;
        }

        public static LinkedListNode insertAtTail(LinkedListNode head, LinkedListNode node)
        {
            if (head == null) {
                return node;
            }
            LinkedListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            return head;
        }

        public static LinkedListNode createLinkedList(ArrayList<Integer> lst) {
            LinkedListNode head = null;
            LinkedListNode tail = null;
            for (Integer x : lst) {
                LinkedListNode newNode = new LinkedListNode(x);
                if (head == null) {
                    head = newNode;
                } else {
                    tail.next = newNode;
                }
                tail = newNode;
            }
            return head;
        }

        public static LinkedListNode createLinkedList(int[] arr) {
            LinkedListNode head = null;
            LinkedListNode tail = null;
            for (int i = 0; i < arr.length; ++i) {
                LinkedListNode newNode = new LinkedListNode(arr[i]);
                if (head == null) {
                    head = newNode;
                } else {
                    tail.next = newNode;
                }
                tail = newNode;
            }
            return head;
        }

        public static LinkedListNode createRandomList(int length) {
            LinkedListNode listHead = null;
            Random generator = new Random();
            for(int i = 0; i < length; ++i) {
                listHead = insertAtHead(listHead, generator.nextInt(100));
            }
            return listHead;
        }

        public static ArrayList<Integer> toList(LinkedListNode head) {
            ArrayList<Integer> lst = new ArrayList<Integer>();
            LinkedListNode temp = head;
            while (temp != null) {
                lst.add(temp.data);
                temp = temp.next;
            }
            return lst;
        }

        public static void display(LinkedListNode head) {
            LinkedListNode temp = head;
            while (temp != null) {
                System.out.printf("%d", temp.data);
                temp = temp.next;
                if (temp != null) {
                    System.out.printf(", ");
                }
            }
            System.out.println();
        }


        public static LinkedListNode mergeAlternating(LinkedListNode list1, LinkedListNode list2) {
            if (list1 == null) {
                return list2;
            }

            if (list2 == null) {
                return list1;
            }

            LinkedListNode head = list1;

            while (list1.next != null && list2 != null) {
                LinkedListNode temp = list2;
                list2 = list2.next;

                temp.next = list1.next;
                list1.next = temp;
                list1 = temp.next;
            }

            if (list1.next == null) {
                list1.next = list2;
            }

            return head;
        }

        static boolean isEqual(LinkedListNode list1, LinkedListNode list2) {
            if (list1 == list2) {
                return true;
            }

            while (list1 != null && list2 != null) {
                if (list1.data != list2.data) {
                    return false;
                }

                list1 = list1.next;
                list2 = list2.next;
            }

            return (list1 == list2);
        }
    }
// ========================  Algorithm =======================================//
    public static LinkedListNode merge2Country(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dummy = new LinkedListNode(-1);

        LinkedListNode prev = dummy;
        while(l1 != null && l2 != null) {
            if(l1.data <= l2.data) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }


        if(l1 == null)
            prev.next = l2;
        else
            prev.next = l1;
        return dummy.next;
    }

    public static LinkedListNode mergeKLists(List<LinkedListNode>lists) {
        if(lists.size() > 0) {
            LinkedListNode result = lists.get(0);

            for(int i = 1; i < lists.size(); i++)
                result = merge2Country(result, lists.get(i));

            return result;
        }
        return new LinkedListNode(-1);
    }



    public static void main(String[] args) {
        LinkedListNode a = LinkedList.createLinkedList(new int[] {11,41,51});

        LinkedListNode b = LinkedList.createLinkedList(new int[] {21,23,42});

        LinkedListNode c = LinkedList.createLinkedList(new int[] {25,56,66,72});

        List<LinkedListNode> list1 = new ArrayList<LinkedListNode>();
        list1.add(a);
        list1.add(b);
        list1.add(c);

        System.out.print("All movie ID's from best to worse are:\n");
        LinkedList.display(mergeKLists(list1));
    }
}
