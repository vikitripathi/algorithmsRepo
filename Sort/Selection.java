
/**
 * This class demonstrates the use of the Comparable interfaces
 * by developing several versions of the selection sort algorithm,
 * each one containing minor changes from the previous one.
 */
public class Selection
{
  
  /**
   * 1. Selection sort for integer arrays, as written in class.
   */
  public static void selectionSort(int[] arr)
  {
    for (int i = 0; i < arr.length - 1; ++i)
    {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; ++j)
      {
        if (arr[j] < arr[minIndex])
        {
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  
  /**
   * 2. Same algorithm, but modified to sort Strings. Instead
   * of using "<" to compare elements, we use the fact that String
   * implements the Comparable interface, and therefore has a method
   * compareTo().  Also, the temp variable is changed to type String.
   * Those are the only two changes in the code.
   */
//  public static void selectionSort(String[] arr)
//  {
//    for (int i = 0; i < arr.length - 1; ++i)
//    {
//      int minIndex = i;
//      for (int j = i + 1; j < arr.length; ++j)
//      {
//        // "<" changed to use of compareTo()
//        if (arr[j].compareTo(arr[minIndex]) < 0)
//        {
//          minIndex = j;
//        }
//      }
//      // int changed to String
//      //swapping done 
//      String temp = arr[i];
//      arr[i] = arr[minIndex];
//      arr[minIndex] = temp;
//    }
//  }

  /**
   * 3. Same algorithm, but modified to sort FullName objects. Since
   * FullName implements the Comparable interface, we can use the 
   * method compareTo(), just as for Strings.
   */
//  public static void selectionSort(FullName[] arr)
//  {
//    for (int i = 0; i < arr.length - 1; ++i)
//    {
//      int minIndex = i;
//      for (int j = i + 1; j < arr.length; ++j)
//      {
//        if (arr[j].compareTo(arr[minIndex]) < 0)
//        {
//          minIndex = j;
//        }
//      }
//      // String changed to FullName
//      FullName temp = arr[i];
//      arr[i] = arr[minIndex];
//      arr[minIndex] = temp;
//    }
//  }

  /**
   * 4. A generic version of the same algorithm.  Here we can sort
   * any type T that implements the Comparable interface.  
   */
  public static <T extends Comparable<T>> void selectionSort(T[] arr)
  {
    for (int i = 0; i < arr.length - 1; ++i)
    {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; ++j)
      {
        if (arr[j].compareTo(arr[minIndex]) < 0)
        {
          minIndex = j;
        }
      }
      // String changed to T
      T temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  public static void main(String[] args){
//	  int[] a={4,2,5,2,65,1,6,3,7,2};
	  String[] a={"cat","abh","viki","shy","rom"};
	  for(int p=0;p<5;p++)
		  System.out.print(a[p]+",");
	  System.out.println("");
	  selectionSort(a);
	  for(int p=0;p<5;p++)
		  System.out.print(a[p]+",");
  }
}
