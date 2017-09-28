// Question: https://leetcode.com/problems/reverse-integer

public class ReverseInteger {
    public int reverse(int x) {
        Stack<Integer> s = new Stack<>();

        int cur = x;
        while (cur != 0) {
            s.push(cur % 10);
            cur /= 10;
        }

        long res = 0;
        long scale = 1;
        while (!s.empty()) {
            res += scale * s.pop();
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }

            scale *= 10;
        }
        return (int) res;
    }
}
