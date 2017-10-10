// Question: https://leetcode.com/problems/perfect-number/

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int end = (int) Math.sqrt(num);
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != 1) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
