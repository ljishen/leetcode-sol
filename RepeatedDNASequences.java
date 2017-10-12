// Question: https://leetcode.com/problems/repeated-dna-sequences/

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();

        Map<String, Integer> subStrToCount = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subStr = s.substring(i, i + 10);
            int count = subStrToCount.getOrDefault(subStr, 0);
            if (count == 1) {
                res.add(subStr);
            }
            subStrToCount.put(subStr, ++count);
        }

        return res;
    }
}
