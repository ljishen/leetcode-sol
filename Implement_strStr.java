// Question: https://leetcode.com/problems/implement-strstr/

public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        int i = 0;
        while (i + needle.length() <= haystack.length()) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
            i++;
        }

        return -1;
    }
}
