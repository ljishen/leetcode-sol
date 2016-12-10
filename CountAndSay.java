public class CountAndSay {
    public String countAndSay(int n) {
        String curDigits = "1";

        int remaining = n - 1;
        while (remaining > 0) {
            int count = 1;
            int i = 1;

            StringBuilder newDigits = new StringBuilder();
            while (i <= curDigits.length()) {
                char prevDigit = curDigits.charAt(i - 1);
                if (i == curDigits.length() || curDigits.charAt(i) != prevDigit) {
                    newDigits.append(String.valueOf(count));
                    newDigits.append(prevDigit);
                    count = 1;
                } else {
                    count++;
                }
                i++;
            }

            curDigits = newDigits.toString();

            remaining--;
        }

        return curDigits;
    }
}
