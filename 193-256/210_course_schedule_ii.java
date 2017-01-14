public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new LinkedList<List<Integer>>();
        
        // initialize adj with all empty linkedlist
        for (int i=0; i<numCourses; i++) {
            adj.add(new LinkedList<Integer>());
        }
        
        // compute indegree for each node
        for (int[] preq : prerequisites) {
            int course = preq[0];
            int prereq = preq[1];
            indegree[course]++;
            adj.get(prereq).add(course);
        }
        
        // create a queue and add those indegree 0 nodes
        Queue<Integer> qu = new LinkedList<>();
        for (int i=0; i<numCourses; i++) {
            if (indegree[i]==0) qu.add(i);
        }
        
        int size=0;
        int ret[] = new int[numCourses];
        while (!qu.isEmpty()) {
            int tmp = qu.remove();
            ret[size] = tmp;
            for (Integer node : adj.get(tmp)) {
                if (--indegree[node]==0) qu.add(node);
            }
            size++;
        }
        return size==numCourses ? ret : new int[0];
    }
}