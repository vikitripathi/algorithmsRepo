public class Merge
{
private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
{ 
  assert isSorted(a, lo, mid);
	// precondition: a[lo..mid] sorted
  assert isSorted(a, mid+1, hi); // precondition: a[mid+1..hi] sorted
   for (int k = lo; k <= hi; k++)
	   aux[k] = a[k];
   int i = lo, j = mid+1;
   for (int k = lo; k <= hi; k++)
   {
	   if 	   (i > mid)               a[k]=aux[j++];
	   else if (j > hi)                a[k]=aux[i++];
	   else if (less(aux[j], aux[i]))  a[k]=aux[j++];
	   else                            a[k]=aux[i++];
   }
  assert isSorted(a, lo, hi);
   
}
private static boolean isSorted(Comparable[] a, int lo, int hi) {
    for (int i = lo + 1; i <= hi; i++)
        if (less(a[i], a[i-1])) return false;
    return true;
}
private static boolean less(Comparable v, Comparable w)
{ 
	return (v.compareTo(w) < 0);
}
private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
{
if (hi <= lo) return;// improve this by using insertion sort
int mid = lo + (hi - lo) / 2;
sort(a, aux, lo, mid);
sort(a, aux, mid+1, hi);
//another improvement 
// if (!less(a[mid+1], a[mid])) return;
merge(a, aux, lo, mid, hi);
}
public static void sort(Comparable[] a)
{
Comparable[] aux= new Comparable[a.length];
sort(a, aux, 0, a.length - 1);
}
//Client
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