// Question: https://leetcode.com/problems/excel-sheet-column-title/

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int curNum = n;

        do {
            curNum--;
            sb.insert(0, (char) ('A' + curNum % 26));
            curNum /= 26;
        } while (curNum > 0);

        return sb.toString();
    }
}
