//Using a for loop, fill the array a with 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2. Complete the code below.

import java.util.Arrays;

public class Fill
{
   public static void main(String[] args)
   {
      int[] a = new int[18];
	    for (int i=0, j=0; i< a.length; i++)
	    {
	       a[i] = j++;
	       if(j == 3){
	          j =0;
	         
	       }
	    }
	    System.out.println(Arrays.toString(a));
   }
}