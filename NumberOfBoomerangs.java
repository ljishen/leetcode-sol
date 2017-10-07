// Question: https://leetcode.com/problems/number-of-boomerangs/

public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Integer, Integer> distToNum = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }

                int dist = distance(points[i], points[j]);
                Integer num = distToNum.get(dist);
                if (num == null) {
                    distToNum.put(dist, 1);
                } else {
                    distToNum.put(dist, ++num);
                }
            }

            for (int v : distToNum.values()) {
                count += v * (v - 1);
            }

            distToNum.clear();
        }

        return count;
    }

    private int distance(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}
