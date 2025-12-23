class Solution {
    public void bfs(ArrayList<ArrayList<Integer>> adj,int[] indegree,ArrayList<Integer> topo){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)q.add(i);
        }
        while(!q.isEmpty()){
            int x=q.poll();
            topo.add(x);
            for(int neighbor:adj.get(x)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0) q.add(neighbor);
            }
        }
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[V];
        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
            indegree[e[1]]++;
        }
        
        ArrayList<Integer> topo = new ArrayList<>();
        bfs(adj, indegree, topo);
        return topo;
    }
}