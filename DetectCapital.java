// Question: https://leetcode.com/problems/detect-capital/

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        char[] cs = word.toCharArray();

        boolean firstUpperCase = isUpperCase(cs[0]);
        if (!firstUpperCase) {
            return checkCase(cs, 1, false);
        } else {
            if (cs.length == 1) {
                return true;
            }

            boolean secondUpperCase = isUpperCase(cs[1]);
            if (secondUpperCase) {
                return checkCase(cs, 2, true);
            } else {
                return checkCase(cs, 2, false);
            }
        }
    }

    private boolean checkCase(char[] cs, int start, boolean allUpperCase) {
        for (int i = start; i < cs.length; i++) {
            if (isUpperCase(cs[i]) != allUpperCase) {
                return false;
            }
        }
        return true;
    }

    private boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }
}
