// Question: https://leetcode.com/problems/excel-sheet-column-number/description/

public class ExcelSheetColumnNumber {
  public int titleToNumber(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }

    int num = 0;
    int exp = 0;

    char[] cs = s.toCharArray();
    for (int i = cs.length - 1; i >= 0; i--) {
      int digit = cs[i] - 'A' + 1;
      num += digit * Math.pow(26, exp);
      exp++;
    }

    return num;
  }
}
