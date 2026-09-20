class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjlist = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adjlist.add(new ArrayList<Integer>());
        }
            for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected.length; j++) {

                if (isConnected[i][j] == 1 && i != j) {
                    adjlist.get(i).add(j);
                }
            }
        }
        int[] vis = new int[isConnected.length];
        int count = 0;
        for(int i =0;i<isConnected.length;i++){
            if(vis[i] == 0){
                count++;
                dfs(i,adjlist,vis);
            }
        }
        return count;
    }
    public static void dfs(int node , List<List<Integer>> adjlist,int[] vis){
        vis[node] =1;
        for(int it :adjlist.get(node)){
            if(vis[it] == 0){
                dfs(it,adjlist,vis);
            }
        }
    }
}