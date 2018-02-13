// Question: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class LetterCombinationsOfAPhoneNumber {
  private String[] indexOfLetters =
      new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    if (digits.isEmpty() || digits.contains("0") || digits.contains("1")) {
      return Collections.<String>emptyList();
    }

    List<String> res = new ArrayList<>();
    fill(res, "", digits);
    return res;
  }

  private void fill(List<String> res, String cur, String digits) {
    if (digits.isEmpty()) {
      res.add(cur);
      return;
    }

    String letters = indexOfLetters[digits.charAt(0) - '0'];
    for (int i = 0; i < letters.length(); i++) {
      cur += letters.charAt(i);
      fill(res, cur, digits.substring(1));
      cur = cur.substring(0, cur.length() - 1);
    }
  }
}
