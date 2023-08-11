package arraysAndHashing;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] mySorted = s.toCharArray();
        char[] mySortedTwo = t.toCharArray();

        Arrays.sort(mySorted);
        Arrays.sort(mySortedTwo);

        String str1 = new String(mySortedTwo);
        String str2 = new String(mySorted);

        return str1.equals(str2);
    }
}
