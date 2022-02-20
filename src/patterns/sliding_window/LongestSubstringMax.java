package patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringMax {

    //Longest Substring with maximum K Distinct Characters (medium)
    /*
    * Time Complexity 0(n)
     */

    public static int findLength(String str, int k) {

        if(str == null || str.length() == 0) throw new IllegalArgumentException();
        int windowStart = 0, maxLength = 0;

        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        // The following loop we will extend the range of [windowStart, windowEnd]
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {

            char rightChar = str.charAt(windowEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            while(charFrequencyMap.size() > k) {
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);

                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }

                windowStart++; // shrink the window
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
        }
        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringMax.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubstringMax.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubstringMax.findLength("cbbebi", 3));
    }



}
