// Question: https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        } else if (strs.length == 0) {
            return "";
        }

        int end = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int length = strs[i].length();
            for (int j = 0; j < length && j < end; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    end = j;
                    break;
                }
            }

            if (end > length) {
                end = length;
            }
        }

        return strs[0].substring(0, end);
    }
}
