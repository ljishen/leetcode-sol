// Question: https://leetcode.com/problems/assign-cookies/ 

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] > s[j]) {
                j++;
            } else if (s[j] >= g[i]) {
                count++;
                j++;
                i++;
            }
        }

        return count;
    }
}
