package netflix;
import java.util.*;

public class FeatureThree {
    /*  Find Median Age   (Find the Median From A Data Stream) Algo */

    // ======= Description ======== //
    /*
    Our third task is building a filter that will fetch relevant content based on the age of th users for a specific country
    or region. For this, we use the median age of users and the preferred content for users that fall into that
    specified category.

    Because the number of users is constantly increasing on the Netflix platform, we need to figure out a structure
    or design that updates the median age of users in real-time. We will have an array that constantly receives age
    values, and we will output the median value after each new data point.


      // ======= Solution =========== //
      We will assume that 'x' is the median age of a user in a list. Half of the ages in the list
      will be smaller than (or equal to) 'x', and the other half will be greater than (or equal to) 'x'.
      We can divide the list into two halves: one half to store the smaller numbers (say smallList),
      and one half to store the larger numbers (say largeList). The median of all ages will either
      be the largest number in the smallList or the smallest number in the largeList. If the total
      number of elements is even, we know that the median will be the average of these two numbers. The BEST
      data structure for finding the smallest or largest number among a list of numbers is a Heap.

      // ======= Implementation ======= //
      1. First, we will store the first half of the numbers(smallList) in a MaxHeap. We use a MaxHeap
      because we want to know the largest number in the first half of the list.

      2. Then, we will store thr second half of the numbers(largeList) in a minHeap, because we want
      to know the smallest number in the second half of the list.

      3. We can calculate the median of the current list of numbers using the top element of the two heaps
      */
    static class MedianOfAges {

        PriorityQueue<Integer> smallList; //containing first half of numbers
        PriorityQueue<Integer> largeList; //containing second half of numbers

        public MedianOfAges() {
            smallList = new PriorityQueue<>((a, b) -> b - a);
            largeList = new PriorityQueue<>((a, b) -> a - b);
        }

        public void insertNum(int num) {
            if (smallList.isEmpty() || smallList.peek() >= num)
                smallList.add(num);
            else
                largeList.add(num);

            // either both the heaps will have equal number of elements or max-heap will have one
            // more element than the min-heap
            if (smallList.size() > largeList.size() + 1)
                largeList.add(smallList.poll());
            else if (smallList.size() < largeList.size())
                smallList.add(largeList.poll());
        }

        // ^^^^ O(Log N) due to insertion in the Heap;

        public double findMedian() {
            if (smallList.size() == largeList.size()) {
                // we have even number of elements, take the average of middle two elements
                return smallList.peek() / 2.0 + largeList.peek() / 2.0;
            }
            // because max-heap will have one more element than the min-heap
            return smallList.peek();
        }
        // ^^^ O(1) retrieval of the median from the top elements in the heap
        public static void main(String[] args) {
            // Driver code

            MedianOfAges MedianOfAges = new MedianOfAges();
            MedianOfAges.insertNum(22);
            MedianOfAges.insertNum(35);
            System.out.println("The recommended content will be for ages under: " + MedianOfAges.findMedian());
            MedianOfAges.insertNum(30);
            System.out.println("The recommended content will be for ages under: " + MedianOfAges.findMedian());
            MedianOfAges.insertNum(25);
            System.out.println("The recommended content will be for ages under: " + MedianOfAges.findMedian());
        }
    }



}
