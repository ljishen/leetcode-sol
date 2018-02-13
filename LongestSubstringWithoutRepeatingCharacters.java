// Question:
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    int[] numOfLetters = new int[95];

    int start = 0;
    int end = 0;

    int maxLength = 0;

    char[] cs = s.toCharArray();
    while (end < cs.length) {
      if (numOfLetters[cs[end] - ' '] == 0) {
        numOfLetters[cs[end] - ' ']++;
        end++;
      } else {
        int curLength = end - start;
        maxLength = curLength > maxLength ? curLength : maxLength;

        if (numOfLetters[cs[start] - ' '] > 0) {
          numOfLetters[cs[start] - ' ']--;
          start++;
        }
      }
    }

    int curLength = end - start;
    maxLength = curLength > maxLength ? curLength : maxLength;

    return maxLength;
  }
}
