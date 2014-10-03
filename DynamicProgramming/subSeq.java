/*
 * find the maximum sum of a sub-sequence with the constraint that no two numbers 
 * in the sequence should be adjacent in the array
 */
/* O(N) time and O(1) space solution in Java */
public class subSeq {
   
	public static int FindMaxSubSeqSum(int[] elems)
    {
        if (elems.length == 0)
            return 0;
        if (elems.length == 1)
            return elems[0];
        if (elems.length == 2)
            Math.max(elems[0], elems[1]);//use internal functions instead of your own (math.max)
        int sumOneStepAway = elems[1];
        int sumTwoStepsAway = elems[0];
        int curentSum = elems[0] + elems[2];
        if (elems.length == 3)
            return Math.max(sumOneStepAway, curentSum);//numbers are positive,so two numbers sum greater than one of that no	
        for (int i = 3; i < elems.length; i++)
        {
            int aux = curentSum;
            curentSum = elems[i];
            if (sumOneStepAway < sumTwoStepsAway)
                curentSum += sumTwoStepsAway;
            else
                curentSum += sumOneStepAway;
            sumTwoStepsAway = sumOneStepAway;
            sumOneStepAway = aux;
        }
        return Math.max(curentSum, sumOneStepAway);
    }
	
	
	
	public static void main(String[] args){
    	  int[] a={4,2,5,2,9,8,3};
    	  int j=FindMaxSubSeqSum(a);
    	  System.out.println(j);
	}
}
