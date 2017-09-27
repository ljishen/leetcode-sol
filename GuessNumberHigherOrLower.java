// Question: https://leetcode.com/problems/guess-number-higher-or-lower

/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
     int guess(int num); */

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int res = guess(mid);

            if (res == 0) {
                return mid;
            }

            if (guess(mid) < 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
