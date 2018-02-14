// Question: https://leetcode.com/problems/combination-sum/description/

public class CombinationSum {
  private List<List<Integer>> res;

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    res = new ArrayList<List<Integer>>();
    tryAdd(candidates, target, 0, new ArrayList<Integer>());
    return res;
  }

  private void tryAdd(int[] candidates, int target, int left, List<Integer> list) {
    if (target == 0 && !list.isEmpty()) {
      res.add(new ArrayList<Integer>(list));
      return;
    }

    for (int i = left; i < candidates.length; i++) {
      int remain = target - candidates[i];
      if (remain < 0) {
        continue;
      }

      list.add(candidates[i]);
      tryAdd(candidates, remain, i, list);
      list.remove(list.size() - 1);
    }
  }
}
