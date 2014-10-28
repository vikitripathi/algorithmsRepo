/*
 * this is the graph API 
 * uses Adjacency List implemetation of graph
 * our graph processing algorithms will be the clients of this API
 */
public class Graph {
	private final int V;//instance variable
	private int E;
	private Bag<Integer>[] adj;//array of bags of integers , adjacency list using bag data types
	@SuppressWarnings("unchecked")
	public Graph(int V)
	{
		//constructor
		//create an empty graph with V vertices
		this.V=V;//value V in instance variable
		adj =(Bag<Integer>[]) new Bag[V];//array of size V of bags of integers
		for (int v=0;v<V;v++)
			adj[v]=new Bag<Integer>();//empty
		
	}
	Graph(In in)
	{
		//constructor
		//create a graph from input stream
		this(in.readInt());
        int E = in.readInt();
        for (int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v, w);
        }
	}
	void addEdge(int v,int w)
	{
		//add an edge v-w
		//add v to w's bag and w to v's bag
		//Parallel edges and self-loops allowed.
		adj[v].add(w);
		adj[w].add(v);
		
	}
	public Iterable<Integer> adj(int v)
	{
		//iterator for vertices adjacent to v
		//return bag which is iterable
		return adj[v];//nice example of power of abstraction , as we did bag implementation that implements iterator,
		//a low level processing done earlier and now produces a efficient data structures
		
		
	}
	/*
	 * Graph.V() returns no. of vertices
	 */
	int V()
	{
		//no of vertices
		return V;
	}
	int E()
	{
		//no of edges
		return E;
	}
//	String toString()
//	{
//		//string representation
//	}
	public static void main(String[] args) {
		//client
		In in =new In(args[0]);
		Graph G=new Graph(in);//read graph from input stream
		//print out each edge twice as undirected
		for (int v=0;v<G.V();v++)
			for (int w:G.adj(v))
				StdOut.println(v+"-"+w);
	}
		

}
