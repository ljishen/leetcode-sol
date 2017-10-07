// Question: https://leetcode.com/problems/judge-route-circle/

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;

        char[] moveChars = moves.toCharArray();
        for (char c : moveChars) {
            if (c == 'U') {
                v += 1;
            } else if (c == 'D') {
                v -= 1;
            } else if (c == 'L') {
                h += 1;
            } else if (c == 'R') {
                h -= 1;
            }
        }
        return v == 0 && h == 0;
    }
}
