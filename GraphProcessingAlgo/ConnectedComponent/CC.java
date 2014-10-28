//connected components!!
public class CC {
	private boolean[] marked;   // marked[v] = has vertex v been marked?
	private int[] id;           // id[v] = id of connected component containing v
	private int count;          // number of connected components
	
    public CC(Graph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
//        size = new int[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
                count++;
            }
        }
    }
//	boolean connected(int v,int w){
//		
//	}
	private void dfs(Graph G,int v){
        marked[v] = true;
        id[v] = count;
//        size[count]++;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }		
	}
	public int count(){
		return count;
		
	}
	public int id(int v){
		return id[v];
		
	}

}
