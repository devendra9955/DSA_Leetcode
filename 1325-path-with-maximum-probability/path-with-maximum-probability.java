class Pair{
    int node;
    double prob;
    Pair(int node , double prob){
        this.node = node;
        this.prob = prob;
    }
    public int compareTo(Pair p){
        return Double.compare(this.prob,p.prob);
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int des) {
         ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
        for(int i=0; i<n; i++) adj.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            double wt = succProb[i];
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        double[] prob = new double[n];
        Arrays.fill(prob,0);
        prob[src] = 1;
PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        pq.add(new Pair(src,1));
        while(pq.size() > 0){
            Pair top = pq.remove();
            int node = top.node;
            double probfromsrc = top.prob;
            if(probfromsrc < prob[node]) continue;
            for(Pair p : adj.get(node)){
                int ele = p.node;
                double wt = p.prob;
                double total = probfromsrc * wt;
                 if(total > prob[ele]){
                     prob[ele] = total;
                     pq.add(new Pair(ele,total));
                 }
            }
        }
        return prob[des];
    }
}