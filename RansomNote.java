// Question: https://leetcode.com/problems/ransom-note/

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];

        char[] mcs = magazine.toCharArray();
        for (int i = 0; i < mcs.length; i++) {
            letters[mcs[i] - 'a']++;
        }

        char[] rcs = ransomNote.toCharArray();
        for (int i = 0; i < rcs.length; i++) {
            int idx = rcs[i] - 'a';
            letters[idx]--;
            if (letters[idx] < 0) {
                return false;
            }
        }

        return true;
    }
}
