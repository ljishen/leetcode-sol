// Question: https://leetcode.com/problems/pascals-triangle/

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }

        list.add(Arrays.asList(1));
        if (numRows == 1) {
            return list;
        }

        list.add(Arrays.asList(1, 1));
        if (numRows == 2) {
            return list;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevRow = list.get(i - 1);
            for (int j = 0; j < prevRow.size() - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add(1);
            list.add(row);
        }

        return list;
    }
}
