// Question: https://leetcode.com/problems/course-schedule-ii/description/

public class CourseScheduleII {
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    if (numCourses == 0) {
      return new int[0];
    }

    Set<Integer> noDeps = new HashSet<>();
    for (int i = 0; i < numCourses; i++) {
      noDeps.add(i);
    }

    if (prerequisites == null || prerequisites.length == 0) {
      return noDeps.stream().mapToInt(Integer::intValue).toArray();
    }

    Map<Integer, Set<Integer>> depsOn = new HashMap<>();
    for (int i = 0; i < prerequisites.length; i++) {
      int dep = prerequisites[i][0];
      Set<Integer> depee = depsOn.get(dep);
      if (depee == null) {
        depee = new HashSet<>();
        depsOn.put(dep, depee);
        noDeps.remove(dep);
      }
      depee.add(prerequisites[i][1]);
    }

    int[] res = new int[numCourses];
    int idx = 0;
    while (!noDeps.isEmpty()) {
      Iterator<Integer> iter = noDeps.iterator();
      int course = iter.next();
      noDeps.remove(course);
      res[idx] = course;
      idx++;

      Iterator<Map.Entry<Integer, Set<Integer>>> mIter = depsOn.entrySet().iterator();
      while (mIter.hasNext()) {
        Map.Entry<Integer, Set<Integer>> e = mIter.next();
        Set<Integer> depee = e.getValue();
        if (depee.remove(course) && depee.isEmpty()) {
          noDeps.add(e.getKey());
          mIter.remove();
        }
      }
    }

    return idx == numCourses ? res : new int[0];
  }
}
