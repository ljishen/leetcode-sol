// Question: https://leetcode.com/problems/3sum/description/

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if (nums == null || nums.length < 3) {
      return res;
    }

    Arrays.sort(nums);

    int first = 0;
    int left = first + 1;
    int right = nums.length - 1;

    while (first <= nums.length - 3) {
      int remain = 0 - nums[first];

      while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == remain) {
          res.add(Arrays.<Integer>asList(nums[first], nums[left], nums[right]));

          while (left < right && nums[left + 1] == nums[left]) left++;
          left++;

          while (left < right && nums[right - 1] == nums[right]) right--;
          right--;

          continue;
        }

        if (sum < remain) {
          while (left < right && nums[left + 1] == nums[left]) left++;
          left++;
        } else {
          while (left < right && nums[right - 1] == nums[right]) right--;
          right--;
        }
      }

      while (first <= nums.length - 3 && nums[first + 1] == nums[first]) first++;
      first++;

      left = first + 1;
      right = nums.length - 1;
    }

    return res;
  }
}
