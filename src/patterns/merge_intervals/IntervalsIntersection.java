package patterns.merge_intervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalsIntersection {

    /*
    Given two lists of intervals, find the intersection of these two lists. Each list consists of disjoint intervals sorted on their start time.

    Again from the above diagram, the overlapping interval will be equal to:

    start = max(a.start, b.start)
    end = min(a.end, b.end)
That is, the highest start time and the lowest end time will be the overlapping interval.

So our algorithm will be to iterate through both the lists together to see if any two intervals overlap.
If two intervals overlap, we will insert the overlapped part into a result list and move on to the next interval which is finishing early.


Example 1:

Input: arr1=[[1, 3], [5, 6], [7, 9]], arr2=[[2, 3], [5, 7]]
Output: [2, 3], [5, 6], [7, 7]
Explanation: The output list contains the common intervals between the two lists.


Example 2:

Input: arr1=[[1, 3], [5, 7], [9, 12]], arr2=[[5, 10]]
Output: [5, 7], [9, 10]
Explanation: The output list contains the common intervals between the two lists.

     */


    public static Interval[] merge(Interval[] arr1, Interval[] arr2) {
        List<Interval> result = new ArrayList<Interval>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            // check if the interval arr[i] intersects with arr2[j]
            // check if one of the interval's start time lies within the other interval
            if ((arr1[i].start >= arr2[j].start && arr1[i].start <= arr2[j].end)
                    || (arr2[j].start >= arr1[i].start && arr2[j].start <= arr1[i].end)) {
                // store the intersection part
                result.add(new Interval(Math.max(arr1[i].start, arr2[j].start), Math.min(arr1[i].end, arr2[j].end)));
            }

            // move next from the interval which is finishing first
            if (arr1[i].end < arr2[j].end)
                i++;
            else
                j++;
        }

        return result.toArray(new Interval[result.size()]);
    }

    public static void main(String[] args) {
        Interval[] input1 = new Interval[] { new Interval(1, 3), new Interval(5, 6), new Interval(7, 9) };
        Interval[] input2 = new Interval[] { new Interval(2, 3), new Interval(5, 7) };
        Interval[] result = IntervalsIntersection.merge(input1, input2);
        System.out.print("Intervals Intersection: ");
        for (Interval interval : result)
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input1 = new Interval[] { new Interval(1, 3), new Interval(5, 7), new Interval(9, 12) };
        input2 = new Interval[] { new Interval(5, 10) };
        result = IntervalsIntersection.merge(input1, input2);
        System.out.print("Intervals Intersection: ");
        for (Interval interval : result)
            System.out.print("[" + interval.start + "," + interval.end + "] ");
    }

}
