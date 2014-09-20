//api
public class QuickFindUF {
//data structures 
	private int [] id;
//getters and setters
//packages and classes
//constructor 
public QuickFindUF(int N)
	 {
		 id = new int[N];
		 //n array accesses
		 for (int i = 0; i < N; i++)
		 id[i] = i; 
	 }
public boolean connected(int p, int q){	 
	return id[p] == id[q]; 	 
	//2 array accesses
 }
public void union(int p , int q)
{
	 int pid = id[p];
	 int qid = id[q];
	 for (int i = 0; i < id.length; i++)
	 //2n+2 array accesses
	 if (id[i] == pid) id[i] = qid;
}
public static void main(String[] args){
	int i =Integer.parseInt(args[0]);
	QuickFindUF u=new QuickFindUF(i);
	for (int m = 0; m < i; m++)
		 System.out.print(u.id[m]); 
	System.out.println(" ");
    System.out.println("is 5 and 7 connected ??"+u.connected(5, 7));
    u.union(5,7);
    for (int m = 0; m < i; m++)
		 System.out.print(u.id[m]); 
    System.out.println(" ");
    System.out.println("is 5 and 7 connected?? "+u.connected(5, 7));
	
}

}
