// Question: https://leetcode.com/problems/binary-watch/

public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        Map<Integer, List<Integer>> bitToHours = bitsToNumbers(12);
        Map<Integer, List<Integer>> bitToMinutes = bitsToNumbers(60);

        List<String> times = new ArrayList<>();

        int maxHourBits = Math.min(num, 3);
        for (int i = 0; i <= maxHourBits; i++) {
            List<Integer> minutes = bitToMinutes.get(num - i);
            if (minutes == null) {
                continue;
            }

            List<Integer> hours = bitToHours.get(i);
            for (int h : hours) {
                for (int m : minutes) {
                    StringBuilder time = new StringBuilder();
                    time.append(h);
                    time.append(":");

                    if (m < 10) {
                        time.append("0");
                    }
                    time.append(m);

                    times.add(time.toString());
                }
            }
        }

        return times;
    }

    private Map<Integer, List<Integer>> bitsToNumbers(int max) {
        Map<Integer, List<Integer>> bitToNums = new HashMap<>();
        for (int i = 0; i < max; i++) {
            int bits = Integer.bitCount(i);
            List<Integer> nums = bitToNums.get(bits);
            if (nums == null) {
                nums = new ArrayList<>();
                bitToNums.put(bits, nums);
            }
            nums.add(i);
        }
        return bitToNums;
    }
}
