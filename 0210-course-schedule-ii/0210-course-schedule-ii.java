
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        
        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }

        
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int[] order = new int[numCourses];
        int count = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            order[count++] = node;

            for (int it : adj.get(node)) {
                indegree[it]--;

                if (indegree[it] == 0) {
                    q.offer(it);
                }
            }
        }

        
        if (count != numCourses) {
            return new int[0];
        }

        return order;
    }
}
