// Question: https://leetcode.com/problems/top-k-frequent-elements/

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int n: nums) {
            Integer freq = freqs.get(n);
            if (freq == null) {
                freq = 0;
            }
            freqs.put(n, ++freq);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int num : freqs.keySet()) {
            int freq = freqs.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        List<Integer> res = new ArrayList<>();
        int freq = buckets.length - 1;
        while (freq > 0 && res.size() < k) {
            List<Integer> numsOfFreq = buckets[freq];
            if (numsOfFreq != null) {
                res.addAll(numsOfFreq);
            }
            freq--;
        }
        return res;
    }
}
