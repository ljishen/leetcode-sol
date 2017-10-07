// Question: https://leetcode.com/problems/number-of-segments-in-a-string/

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if (s == null) {
            return 0;
        }

        String rfs = s.trim();
        if (rfs.isEmpty()) {
            return 0;
        }

        return rfs.split("\\s+").length;
    }
}
