// Question: https://leetcode.com/problems/construct-the-rectangle/

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int start = (int) Math.sqrt(area);

        for (int i = start; i >= 1; i--) {
            if (area % i == 0) {
                return new int[] {area / i, i};
            }
        }

        throw new RuntimeException("Error!");
    }
}
