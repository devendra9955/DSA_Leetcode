class Solution {
    public void bfs(int start,List<List<Integer>> edges, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;
        while(q.size() > 0){
            int front = q.remove();
            for(int ele : edges.get(front)){
                if(!vis[ele]){
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        bfs(source,adj,vis);
        for(boolean ele : vis){
            if(vis[destination]==false) return false;
        }
        return true;
    }
}