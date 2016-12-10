// Question: https://leetcode.com/problems/excel-sheet-column-number/

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int length = s.toCharArray().length;

        int idx = 0;
        for (int i = 0; i < length; i++) {
            idx = (s.charAt(i) - 'A' + 1) + idx * 26;
        }

        return idx;
    }
}
