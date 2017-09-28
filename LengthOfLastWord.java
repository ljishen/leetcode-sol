// Question: https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String str = s.trim();

        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) != ' ') {
            i--;
        }
        return i == -1 ? str.length() : str.length() - 1 - i;
    }
}
