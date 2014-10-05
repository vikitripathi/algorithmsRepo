//Heap sort
//analysis:: heap construction uses < 2N compares and exchanges
//and Heap Sort uses < 2 N lg N compare and exchanges 
// and is in place , space complexity 1
//so heap sort is in place sorting algo
//not used becoz.... poor use of cache memory and inner loop takes long time than quick sort!!
public class Heap {

	 public static void sort(Comparable[] a)
	 {
	 int N = a.length;
	 for (int k = N/2; k >= 1; k--)//this loop is to make heap ordered!!
	 sink(a, k, N);
	 while (N > 1)//sortdown
	 {
	 exch(a, 1, N);
	 sink(a, 1, --N);
	 }
	 }
	
	 private static void sink(Comparable[] a, int k, int N)
	 {
	 while (2*k <= N)
	 {
			 int j = 2*k;
			 if (j < N && less(a,j, j+1)) j++;
			 if (!less(a,k, j)) break;//break occurs when k is > than j i.e. the () is true
			 exch(a,k, j);
			 k = j;//for other level of sinking if it exists
		 }
	 }
	 private static boolean less(Comparable[] a,int i, int j)
		{ 
			return (a[i].compareTo(a[j]) < 0);//compareTo is not for integer data type , here data-type is comparable
		}
	 
	private static void exch( Comparable[] a,int i, int j)
		{ 
		Comparable swap = a[i];
	    a[i] = a[j];
	    a[j] = swap;  	
	    }
	public static void main(String[] args){

	}
}
