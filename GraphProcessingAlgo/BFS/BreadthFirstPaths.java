
public class BreadthFirstPaths {
	    private boolean[] marked;  // marked[v] = is there an s-v path
	    private int[] edgeTo;      // edgeTo[v] = previous edge on shortest s-v path
	    //private int[] distTo;      // distTo[v] = number of edges shortest s-v path
	    private final int s;
	    // breadth-first search from a single source
	    public BreadthFirstPaths(Graph G, int s){
			//initialize data strucutres
			this.s=s;
			marked = new boolean[G.V()];
			edgeTo = new int[G.V()];
			bfs(G,s);
		}
	    private void bfs(Graph G, int s) {
	        Queue<Integer> q = new Queue<Integer>();
	        //for (int v = 0; v < G.V(); v++) distTo[v] = Integer.MAX_VALUE;
	        //distTo[s] = 0;
	        marked[s] = true;
	        q.enqueue(s);

	        while (!q.isEmpty()) {
	            int v = q.dequeue();
	            for (int w : G.adj(v))//use of proper design pattern , see the use of Graph.adj() method here!
	            {
	                if (!marked[w]) {
	                    edgeTo[w] = v;
	                    //distTo[w] = distTo[v] + 1;
	                    marked[w] = true;
	                    q.enqueue(w);
	                }
	            }
	        }
	    }

}
