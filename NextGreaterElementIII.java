// Question: https://leetcode.com/problems/next-greater-element-iii/

public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        LinkedList<Integer> list = new LinkedList<>();

        long cur = n;
        int remains = 0;

        while (cur != 0) {
            remains = (int) (cur % 10);
            cur /= 10;
            if (!list.isEmpty() && remains < list.peekLast()) {
                break;
            }

            if (cur == 0) {
                return -1;
            }

            insert(list, remains, 0, list.size());
        }

        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            if (val > remains) {
                list.set(i, remains);
                list.add(0, val);
                break;
            }
        }

        while (!list.isEmpty()) {
            cur = cur * 10 + list.pollFirst();
            if (cur > Integer.MAX_VALUE) {
                return -1;
            }
        }
        return (int) cur;
    }

    private void insert(List<Integer> list, int n, int start, int end) {
        if (start == end) {
            list.add(start, n);
            return;
        }

        int mid = start + (end - start) / 2;
        int midVal = list.get(mid);

        if (n < midVal) {
            insert(list, n, start, mid);
        } else {
            insert(list, n, mid + 1, end);
        }
    }
}
