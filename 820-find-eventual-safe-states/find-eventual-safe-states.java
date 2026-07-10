class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int indegree[] = new int[n];
        for(int i=0; i<n; i++) adj.add(new ArrayList<>());
        for(int i=0; i<n; i++){
            for(int j=0; j<graph[i].length; j++){
                int v = graph[i][j];
                int u = i;
                adj.get(v).add(u);
                indegree[u]++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i]==0) q.add(i);
        }
        while(q.size()>0){
            int front = q.remove();
            ans.add(front);
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}