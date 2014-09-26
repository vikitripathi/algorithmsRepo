// does int datatype implements comparable interface??
public class Insertion {
	public static void sort(Comparable[] a)
	{
		int N = a.length;
		for (int i = 1; i < N; i++)
		{
			for (int j = i; j >0; j--)
			if (less(a[j], a[j-1]))
				exch(a, j, j-1);
			else break; // move out of inner loop
		}
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
//	public static void sort(int[] a)
//	{
//		int N = a.length;
//		for (int i = 0; i < N; i++)
//		{
//			for (int j = i; j >0; j--)
//			if (less(a[j], a[j-1]))
//				exch(a, j, j-1);
//			else break; // move out of inner loop
//		}
//	}
//	private static void exch(int[] a, int i, int j)
//	{ 
//		int swap = a[i];
//	    a[i] = a[j];
//	    a[j] = swap; 
//    }
	public static void main(String[] args) {
        String[] a={"viki","ram","abhi","som","lak","cat","ele"};
      //  int[] a={4,2,5,2,65,1,6,3,7,2};
        for(int p=0;p<a.length;p++)
  		  System.out.print(a[p]+",");
  	    System.out.println("");
        sort(a);
        for(int p=0;p<a.length;p++)
    		  System.out.print(a[p]+",");
    }
}
