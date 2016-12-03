// Question: https://leetcode.com/problems/reverse-vowels-of-a-string/

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if (s == null) {
            return null;
        }

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] cs = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !vowels.contains(cs[start])) {
                start++;
            }

            while (start < end && !vowels.contains(cs[end])) {
                end--;
            }

            char tmp = cs[start];
            cs[start] = cs[end];
            cs[end] = tmp;

            start++;
            end--;
        }

        return new String(cs);
    }
}
