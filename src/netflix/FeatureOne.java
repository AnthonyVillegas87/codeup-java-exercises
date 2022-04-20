package netflix;


import java.util.*;
public class FeatureOne {
    /* Group Similar Title    (Group Anagrams Algo)*/

    // ======= Description ======== //
    /* First we need to figure out a way to individually group all character combinations of
     each title. Suppose the content library contains the following titles: "duel", "dule", "speed", "spede", "deul", "cars".
     How would you efficiently implement a functionality so that if a user mispells speed as spede, they are shown the correct title?

     We want to split the list of titles into sets of words so that all words in a set are anagrams. In
     the above list, there are three sets: {"duel", "dule", "deul" } , {"speed", "spede"} , and  {"cars"}.
     Search results should comprise all members of the set that the search string is found in. We should pre-compute these
     sets instead f forming them when the user searches a title.


    // ======= Solution =========== //
    We see that all members of each set are characterized by the same frequency of each alphabet. This means
    that the frequency of each alphabet in words belonging to the same group is equal, In the set {{"speed ", "spede"}},
    the frequency of the characters s, p, e, and d are in each word.

    // ======= Implementation ======= //
    1. For each title, compute a 26-element vector. Each element in this vector represents the frequency
    of an english letter in the corresponding title. This frequency count will be represented as a string delimited with # characters.
    For example, abbccc will be represented as #1#2#3#0#0#0.....#0. This will generate identical vectors
    for strings that are anagrams.

    2. Use this vector as a key to insert the title into a HashMap. All anagrams will be mapped to the same entry in this HashMap. When
    the user searches a word, compute the 26-element english letter frequency vector based on the word. Search in the
    HashMap using this vector and return all map entries.

    3. Store the vector of the calculated character counts in the same HashMap as a key and assign the respective
    set of anagrams as its value.

    4. Return the values of the HashMap, since each value will be an individual set.
       */


    public static List<List<String>> groupAnagrams(String[] strs){
        if (strs.length == 0)
            return new ArrayList<List<String>>();

        Map<String, List<String>> res = new HashMap<String, List<String>>();

        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()){
                int index = c - 'a';
                count[index]++;
            }

            StringBuilder delimStr = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                delimStr.append('#');
                delimStr.append(count[i]);
            }

            String key = delimStr.toString();
            if (!res.containsKey(key))
                res.put(key, new ArrayList<String>());

            res.get(key).add(s);
        }

        return new ArrayList<List<String>>(res.values());
    }

    public static void main(String[] args) {
        // Driver code
        String titles[] = {"duel","dule","speed","spede","deul","cars"};

        List<List<String>> gt = groupAnagrams(titles);
        String query = "spede";

        // Searching for all titles
        for (List<String> g : gt){
            if (g.contains(query))
                System.out.println(g);
        }
    }
}
