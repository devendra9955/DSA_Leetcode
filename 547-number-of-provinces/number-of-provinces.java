class Solution {
    public void bfs(int i,int isConnected[][],boolean[] vis){
        int n = isConnected.length;
        Queue<Integer> q = new LinkedList<>();
        vis[i] = true;
        q.add(i);
        while(q.size() > 0){
            int front = q.remove();
            for(int j=0; j<n; j++){
                if(j != front && !vis[j] && isConnected[front][j]==1){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
    public void dfs(int i, int[][] isConnected, boolean[] vis){
        int n = isConnected.length;
        vis[i]= true;
        for(int j=0; j<n; j++){
            if(isConnected[i][j] == 1 && !vis[j]){
                dfs(j,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                // bfs(i,isConnected,vis);
                dfs(i,isConnected,vis);
                count++;
            }
        }
        return count;
    }
}