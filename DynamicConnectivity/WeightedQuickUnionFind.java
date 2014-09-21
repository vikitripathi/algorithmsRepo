
public class WeightedQuickUnionFind {
	private int [] id;
	private int [] size;
	
	public WeightedQuickUnionFind(int N)
		 {
			 id = new int[N];
			 size = new int[N];
			 for (int i = 0; i < N; i++)
			 {
				 id[i] = i; 
			     size[i] = 1;//initial number of nodes =1 for each
			 }
		 }
	//find connected??
	public boolean connected(int p, int q){	 
		return root(p) == root(q); 	 
		
	 }
	//return root 
	public int root(int r)
	{ 
		System.out.println(r+"is r"+"id[r] is "+ id[r]);
		while(r!=id[r]){
			r=id[r];
			System.out.println(r+"new r"+" new id[r] is"+ id[r]);
		}
		return r;
	}
	public void union(int p , int q)
	{
		int p_root=root(p);
		System.out.println(p_root+ "proot"+size[p_root]+"size of proot");
		int q_root=root(q);
		System.out.println(q_root+"qroot"+size[q_root]+"size of qroot");
		if(size[p_root] < size[q_root])
		{	id[p]=q_root;
		    size[q_root]+=size[p_root];
		}
		else
		{
			id[q]=p_root;
		    size[p_root]+=size[q_root];
			
		}
	}
	public static void main(String[] args){
//		int i =Integer.parseInt(args[0]);
		int i =10;
		WeightedQuickUnionFind u=new WeightedQuickUnionFind(i);
		for (int m = 0; m < i; m++)
			 System.out.print(u.id[m]); 
		System.out.println(" ");
	    System.out.println("is 5 and 7 connected ??"+u.connected(5, 7));
	    u.union(5,7);//union 5 & 7
	    for (int m = 0; m < i; m++)
			 System.out.print(u.id[m]); 
	    System.out.println(" ");
	    System.out.println("is 5 and 7 connected?? "+u.connected(5, 7));
	    System.out.println(u.root(7));
	    System.out.println(u.size[5]);
	    u.union(2, 4);
	    u.union(9,2);
	    u.union(5,2);
	    u.union(7,3);
	    for (int m = 0; m < i; m++)
			 System.out.print(u.id[m]); 
	    System.out.println();
	    System.out.println(u.root(3));
	    System.out.println(u.size[3]);
	    System.out.println(u.root(2));
	    System.out.println(u.size[2]);
		
	}
}
