
public class DepthFirstPaths {
	private boolean[] marked; 
	private int[] edgeTo;
	private final int s;
	public DepthFirstPaths(Graph G, int s){
		//initialize data strucutres
		this.s=s;
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		dfs(G,s);
	}
	private void dfs(Graph G,int v){
		marked[v]=true;
		for(int w:G.adj(v))
			if(!marked[w]){
				dfs(G,w);//recursive
				edgeTo[w]=v;
			}
				
	}
	boolean hasPathTo(int v)
	{
		//has path from s to v
		return marked[v];
	}
	Iterable<Integer> pathTo(int v)
	{
		//path from s to v
		if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
	}
	public static void main(String[] args) {
        In in = new In(args[0]);
        Graph G = new Graph(in);
        int s = Integer.parseInt(args[1]);
        DepthFirstPaths dfs = new DepthFirstPaths(G, s);
        //stack and iterator works??
        for (int v = 0; v < G.V(); v++) 
            if (dfs.hasPathTo(v)) 
                StdOut.printf("%d to %d:  ", s, v);
               
    }

}
