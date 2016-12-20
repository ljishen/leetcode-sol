// Question: https://leetcode.com/problems/course-schedule/

public class CourseSchedule {
    private Map<Integer, Set<Integer>> deptsOfCourse;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) {
            return true;
        }

        deptsOfCourse = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            Set<Integer> dependencies = deptsOfCourse.get(prerequisites[i][0]);
            if (dependencies == null) {
                dependencies = new HashSet<Integer>();
                deptsOfCourse.put(prerequisites[i][0], dependencies);
            }
            dependencies.add(prerequisites[i][1]);
        }

        Set<Integer> resolved = new HashSet<Integer>();
        Set<Integer> unresolved = new HashSet<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (!resolved.contains(i)) {
                if (!dependencyResolve(i, resolved, unresolved)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dependencyResolve(int course, Set<Integer> resolved, Set<Integer> unresolved) {
        Set<Integer> dependencies = deptsOfCourse.get(course);

        if (dependencies != null) {
            unresolved.add(course);
            for (int p : deptsOfCourse.get(course)) {
                if (!resolved.contains(p)) {
                    if (unresolved.contains(p)) {
                        return false;
                    }
                    boolean isCircular = dependencyResolve(p, resolved, unresolved);
                    if (!isCircular) {
                        return isCircular;
                    }
                }
            }
            unresolved.remove(course);
        }

        resolved.add(course);
        return true;
    }
}
