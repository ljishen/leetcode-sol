// Question: https://leetcode.com/problems/add-binary/

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int inc = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || inc > 0; i--, j--) {
            int fst = i < 0 ? 0 : a.charAt(i) - '0';
            int snd = j < 0 ? 0 : b.charAt(j) - '0';

            int res = fst + snd + inc;
            inc = res > 1 ? 1 : 0;
            sb.append(res % 2);
        }

        return sb.reverse().toString();
    }
}
