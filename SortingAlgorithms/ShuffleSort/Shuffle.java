import java.util.Random;
public class Shuffle {
	public static void shuffle(Comparable[] a)
	{
		Random rand = new Random(); 
		//rand.nextInt(40);
		int N = a.length;
		for (int i = 0; i < N; i++)
		{
		int r = rand.nextInt(i + 1); // between 0 &  i 
		exch(a, i, r);
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

	public static void main(String[] args) {
        String[] a={"viki","ramoo","rami","abhi","som","lak","cat","ele"};
      //  int[] a={4,2,5,2,65,1,6,3,7,2};
        for(int p=0;p<a.length;p++)
  		  System.out.print(a[p]+",");
  	    System.out.println("");
        shuffle(a);// random
        for(int p=0;p<a.length;p++)
    		  System.out.print(a[p]+",");
    }
}
