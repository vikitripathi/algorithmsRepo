//largest m in a stream of n items 
//a generic class declaration
public class MaxPQ<Key extends Comparable<Key>> {
	 private Key[] pq;
	// pq[i] = ith element on pq
	private int N;
	// number of elements on pq
	public MaxPQ(int capacity) 
	  //cheap method which require the client to provide the capacity 
	  // of the comparable type,we can easily change it to resizing array or linked list
	{
		// TODO Auto-generated constructor stub
		pq = (Key[]) new Comparable[capacity]; 
		//pq = new Key[capacity]; //error as generic array creation the above line is the true one 
	}
	 public boolean isEmpty()//check its calling??
	 { 
		 return N == 0; 
		 }
	 public void insert(Key x)
	 {
		 pq[N++] = x; 
		 }
	 public Key delMax()
	 {
		 int max = 0;
		 for (int i = 1; i < N; i++)
		 if (less(max, i)) max = i;//lol, a dummy method , not the actual algo!!
		 exch(pq,max, N-1);
		 return pq[--N];
	 }
	 private static boolean less(Comparable v, Comparable w)
		{ 
			return (v.compareTo(w) < 0);
		}
	 
	private static void exch(Comparable[] a, int i, int j)
		{ 
			Comparable swap = a[i];
		    a[i] = a[j];
		    a[j] = swap; 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxPQ<Integer> n= new MaxPQ<Integer>(10);//here we are making key as integer data type
		n.insert(6);
		n.insert(10);
		n.insert(15);
		n.insert(2);
		System.out.println(n.pq);
//		for (int i = 0; i < 10; i++)
//			System.out.println(n.pq[i]);
		System.out.println(n.delMax());
		System.out.println(n.pq);
		
		

	}

}
