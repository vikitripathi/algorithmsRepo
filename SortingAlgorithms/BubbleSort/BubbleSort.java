
public class BubbleSort {

 
 public static void bubbleSort(int numbers[], int array_size)
  {
    int i, j, temp;
    for (i = (array_size - 1); i >= 0; i--)
    {
      for (j = 1; j <= i; j++)
      {
        if (numbers[j-1] > numbers[j])
        {
          temp = numbers[j-1];
          numbers[j-1] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
  }
  public static void main(String[] args){
	  int[] a1={4,2,5,2,65,1,6,3,7,2};
	  for(int p=0;p<10;p++)
		  System.out.print(a1[p]+",");
	  bubbleSort(a1,10);	  
	  System.out.println();
	  for(int p=0;p<10;p++)
		  System.out.print(a1[p]+",");
  }
}


