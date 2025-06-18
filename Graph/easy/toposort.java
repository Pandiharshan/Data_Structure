class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int vertex,ArrayList<Integer> topo){
        vis[vertex]=true;
        for(int ngh : adj.get(vertex)){
            if(!vis[ngh]){
                dfs(adj,vis,ngh,topo);
            }
        }
        topo.add(vertex);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
        }
        boolean[] vis = new boolean[V];
        ArrayList<Integer> topo = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(adj, vis, i, topo);
            }
        }

        Collections.reverse(topo); 
        return topo;
    }
}