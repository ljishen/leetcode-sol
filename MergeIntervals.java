// Question: https://leetcode.com/problems/merge-intervals/description/

/**
 * Definition for an interval. public class Interval { int start; int end; Interval() { start = 0;
 * end = 0; } Interval(int s, int e) { start = s; end = e; } }
 */
public class MergeIntervals {
  public List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() < 2) {
      return intervals;
    }

    Collections.sort(
        intervals,
        new Comparator<Interval>() {
          public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
          }
        });

    int idx = 0;
    int size;
    do {
      size = intervals.size();
      boolean overlop = checkOverlap(intervals.get(idx), intervals.get(idx + 1));
      if (overlop) {
        Interval intvl = intervals.get(idx);
        intvl.end = Math.max(intvl.end, intervals.get(idx + 1).end);
        intervals.remove(idx + 1);
      } else {
        idx++;
      }
    } while (idx < intervals.size() - 1);

    return intervals;
  }

  private boolean checkOverlap(Interval i1, Interval i2) {
    return i1.start <= i2.end && i1.end >= i2.start || i2.start <= i1.end && i2.end >= i1.start;
  }
}
