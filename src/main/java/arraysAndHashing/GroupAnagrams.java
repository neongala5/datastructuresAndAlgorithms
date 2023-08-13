package arraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class  GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String currentString : strs){
            char[] sortedCharArray = currentString.toCharArray();
            Arrays.sort(sortedCharArray);
            String sortedString = new String(sortedCharArray);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<String>());
            }

            map.get(sortedString).add(currentString);
        }

        List<List<String>> groupedAnagrams = new ArrayList<>();
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}
