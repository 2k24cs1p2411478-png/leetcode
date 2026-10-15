
import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int complete = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                visited[i] = true;

                int vertices = 0;
                int degreeSum = 0;

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    vertices++;
                    degreeSum += adj.get(node).size();

                    for (int neighbor : adj.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.offer(neighbor);
                        }
                    }
                }
                if (degreeSum == vertices * (vertices - 1)) {
                    complete++;
                }
            }
        }

        return complete;
    }
}
