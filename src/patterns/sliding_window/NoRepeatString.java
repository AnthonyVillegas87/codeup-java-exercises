package patterns.sliding_window;

import java.util.*;

class NoRepeatSubstring {
    /*
    * Time Complexity 0(k)
     */
    public static int findLength(String str) {
        int windowStart = 0, maxLength = 0;

        Map<Character, Integer> distinctCharMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            // if the map already contains the 'rightChar', shrink the window from the beginning so that
            // we have only one occurrence of 'rightChar'
            if (distinctCharMap.containsKey(rightChar)) {
                // this is tricky; in the current window, we will not have any 'rightChar' after its previous index
                // and if 'windowStart' is already ahead of the last index of 'rightChar', we'll keep 'windowStart'
                windowStart = Math.max(windowStart, distinctCharMap.get(rightChar) + 1);
            }
            distinctCharMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far

        }

        return maxLength;
    }
}
