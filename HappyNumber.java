// Question: https://leetcode.com/problems/happy-number/description/

public class HappyNumber {
  public boolean isHappy(int n) {
    Set<Integer> his = new HashSet<>();

    int sum = n;
    while (his.add(sum) && sum != 1) {
      n = sum;
      sum = 0;

      int remain;
      while (n != 0) {
        remain = n % 10;
        sum += Math.pow(remain, 2);
        n = n / 10;
      }
    }

    return sum == 1;
  }
}
