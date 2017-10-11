// Question: https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (p.length() > 0) {
                sb.append(new StringBuilder(p.length()).append(p).reverse());
            }

            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
