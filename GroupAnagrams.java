// https://leetcode.com/problems/group-anagrams/description/

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> res = new HashMap<String, List<String>>();

    for (String s : strs) {
      char[] cs = s.toCharArray();
      Arrays.sort(cs);
      String sorted = new String(cs);

      List<String> l = res.get(sorted);
      if (l == null) {
        l = new ArrayList<>();
        res.put(sorted, l);
      }
      l.add(s);
    }

    return new ArrayList<List<String>>(res.values());
  }
}
