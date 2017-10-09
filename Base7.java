// Question: https://leetcode.com/problems/base-7/

public class Base7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        String res = "";
        int cur = Math.abs(num);
        while (cur != 0) {
            res = (cur % 7) + res;
            cur = cur / 7;
        }

        return num < 0 ? "-" + res : res;
    }
}
