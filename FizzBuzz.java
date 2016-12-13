// Question: https://leetcode.com/problems/fizz-buzz/

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    public List<String> fizzBuzz(int n) {
        final String fizz = "Fizz";

        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s;

            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    s = FIZZBUZZ;
                } else {
                    s = FIZZ;
                }
            } else if (i % 5 == 0) {
                s = BUZZ;
            } else {
                s = String.valueOf(i);
            }

            res.add(s);
        }
        return res;
    }
}
