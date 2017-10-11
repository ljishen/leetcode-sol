// Question: https://leetcode.com/problems/student-attendance-record-i/

public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        return countOccurrences(s, new int[2], 0);
    }

    private boolean countOccurrences(String s, int[] count, int idx) {
        if (idx == s.length()) {
            return true;
        }

        char c = s.charAt(idx);
        if (c == 'L') {
            count[1]++;
        } else {
            count[1] = 0;
            if (c == 'A') {
                count[0]++;
            }
        }

        if (count[0] > 1 || count[1] > 2) {
            return false;
        }

        return countOccurrences(s, count, ++idx);
    }
}
