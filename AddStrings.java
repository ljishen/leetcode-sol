// Question: https://leetcode.com/problems/add-strings/

public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int inc = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || inc > 0; i--, j--) {
            int fst = i < 0 ? 0 : num1.charAt(i) - '0';
            int snd = j < 0 ? 0 : num2.charAt(j) - '0';

            int res = fst + snd + inc;
            inc = res / 10;
            sb.append(res % 10);
        }

        return sb.reverse().toString();
    }
}
