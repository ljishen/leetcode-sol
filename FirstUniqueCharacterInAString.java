// Question: https://leetcode.com/problems/first-unique-character-in-a-string/

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] letters = new int[26];
        int[] pos = new int[26];

        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            int idx = cs[i] - 'a';
            letters[idx]++;
            if (pos[idx] == 0) {
                pos[idx] = i;
            }
        }

        for (int i = 0; i < cs.length; i++) {
            int idx = cs[i] - 'a';
            if (letters[idx] == 1) {
                return pos[idx];
            }
        }

        return -1;
    }
}
