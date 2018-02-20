// Question: https://leetcode.com/problems/majority-element/description/

public class MajorityElement {
  public int majorityElement(int[] nums) {
    int num = nums[0];
    int count = 1;

    for (int i = 1; i < nums.length; i++) {
      if (num == nums[i]) {
        count++;
      } else {
        count--;
        if (count == 0) {
          num = nums[i];
          count = 1;
        }
      }
    }

    return num;
  }
}
