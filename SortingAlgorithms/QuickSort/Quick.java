//Quick Sort implementation 
public class Quick
{
private static int partition(Comparable[] a, int lo, int hi)
{ 
	int i = lo, j = hi+1;
	while (true)
	{
	while (less(a[++i], a[lo]))
		if (i == hi) break;
	while (less(a[lo], a[--j]))
		if (j == lo) break;
	if (i >= j) break;
	exch(a, i, j);
	}
	exch(a, lo, j);
	return j;
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
public static void sort(Comparable[] a)
{
StdRandom.shuffle(a);//shuffle needed for performance guarantee
sort(a, 0, a.length - 1);
}
private static void sort(Comparable[] a, int lo, int hi)
{
if (hi <= lo) return;
int j = partition(a, lo, hi);
sort(a, lo, j-1);
sort(a, j+1, hi);
}
public static void main(String[] args){
//	  int[] a={4,2,5,2,65,1,6,3,7,2};
	  String[] a={"cat","abh","viki","shy","rom"};
	  for(int p=0;p<5;p++)
		  System.out.print(a[p]+",");
	  System.out.println("");
	  sort(a);
	  for(int p=0;p<5;p++)
		  System.out.print(a[p]+",");
}
}
