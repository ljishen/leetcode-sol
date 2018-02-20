// Question: https://leetcode.com/problems/largest-number/description/

public class LargestNumber {
  public String largestNumber(int[] nums) {
    if (nums == null || nums.length == 0) {
      return "";
    }

    String[] numStrs = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      numStrs[i] = Integer.toString(nums[i]);
    }

    Arrays.sort(
        numStrs,
        new java.util.Comparator<String>() {
          public int compare(String a, String b) {
            return (b + a).compareTo(a + b);
          }
        });

    String res = String.join("", numStrs);
    return res.startsWith("0") ? "0" : res;
  }
}
