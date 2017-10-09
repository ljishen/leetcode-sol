// Question: https://leetcode.com/problems/keyboard-row/

import java.util.regex.Pattern;

public class KeyboardRow {
    private static final Pattern ROW1 = Pattern.compile("[qwertyuiop]*");
    private static final Pattern ROW2 = Pattern.compile("[asdfghjkl]*");
    private static final Pattern ROW3 = Pattern.compile("[zxcvbnm]*");

    public String[] findWords(String[] words) {
        int idx = 0;
        String[] res = new String[words.length];
        for (String w : words) {
            String lw = w.toLowerCase();
            if (ROW1.matcher(lw).matches() ||
                    ROW2.matcher(lw).matches() ||
                    ROW3.matcher(lw).matches()) {
                res[idx] = w;
                idx++;
            }
        }

        return Arrays.copyOfRange(res, 0, idx);
    }
}
