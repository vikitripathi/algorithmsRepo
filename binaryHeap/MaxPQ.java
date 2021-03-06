/*
Find the largest M items in a stream of N items.  <- challenge Binary Heap solves
*/
//implementing priority queue using binary heap
//log N <- insert and log N <- delete
//Key must be Comparable (bounded type parameter)
/*
Binary heap=> Array representation of a heap-ordered complete(balanced except for bottom level) binary tree.
Heap-ordered binary tree. => ・Parent's key no smaller than children's keys.
Largest key is a[1], which is root of binary tree.
・Parent of node at k is at k/2.
・Children of node at k are at 2k and 2k+1.
*/
public class MaxPQ<Key extends Comparable<Key>>  
{
	    private Key[] pq;
		// pq[i] = ith element on pq
		private int N;
		// number of elements on pq
		public MaxPQ(int capacity) 
		  //cheap method which require the client to provide the capacity 
		  // of the comparable type,we can easily change it to resizing array or linked list
		{
			// TODO Auto-generated constructor stub
			pq = (Key[]) new Comparable[capacity+1]; //we dont use 0
			//pq = new Key[capacity]; //error as generic array creation the above line is the true one 
		}
		public boolean isEmpty()//check its calling??
		 { 
			 return N == 0; 
			 }
		 public void insert(Key x)
		 {
			 pq[N++] = x; 
			 swim(N);
			 }
		 public Key delMax()
		 {
			 Key max = pq[1];
			 exch(1, N--);
			 sink(1);
			 pq[N+1] = null;
			 return max;
		 } 
		 //Parent's key becomes smaller than one (or both) of its children's. used in delete operation
		 private void sink(int k)
		 {
		 while (2*k <= N)
		 {
				 int j = 2*k;
				 if (j < N && less(j, j+1)) j++;
				 if (!less(k, j)) break;
				 exch(k, j);
				 k = j;
			 }
		 }
		 //swim performed when Child's key becomes larger key than its parent's key.
		 //so to restore heap order 
		 private void swim(int k)
			 {
				 while (k > 1 && less(k/2, k))
				 {
				 exch(k, k/2);
				 k = k/2;
			 }
		 }
		 private  boolean less(int v, int w)
			{ 
				return (pq[v].compareTo(pq[w]) < 0);
			}
		 
		private void exch( int i, int j)
			{ 
			Key t = pq[i]; pq[i] = pq[j]; pq[j] = t; 	
		    }
		public static void main(String[] args) {
			
			
			

		}
	

}
