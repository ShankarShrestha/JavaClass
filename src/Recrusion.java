import java.util.Arrays;

/**
 * 
 */

/**
 * @author shankar
 *
 */
public class Recrusion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n1 = 0;
//		int n2 = 1;
//		int n3 = 0;
//		int count = 10;
//		
//		System.out.print(n1 + " " + n2 + " ");
//		for(int i=0; i <count; i ++) {
//			n3 = n1 +n2;
//			System.out.print(n3 + " ");
//			n1 = n2;
//			n2 = n3;
//		}
		
		//classTest();
		
		//zero();
		
		//int a = findMin(4,7,9);
		//System.out.println(a);
		
		//Recrusion rc = new Recrusion();
		//double sumTot = rc.totalSum(new double[] {3,4,5,6,7,8,9});
		double arraySum = totalSum(new double[] {3,4,5,6,7,8,9}) ;
		System.out.println(arraySum);
		
		double averageOf = findAverage(new double[] {3,4,5,6,7,8,9});
		System.out.println(averageOf);
		
		int[] displayArray = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(displayArray));
		for(int i=0; i<displayArray.length; i++) {
			System.out.print(displayArray[i] + "|");
			
			if(i>0) {
				System.out.print(" | ");
			}
			System.out.print(displayArray[i]);
		}
		int[] displayArray1 = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<displayArray1.length; i++) {
			if(displayArray1[i] == 5) {
				System.out.println("Position: " + i);
				break;

			}
		}
		
		
	}
	
	public static void returnRecrusion() {
		
	}
	
	public static void classCode() {
		
		//pass two prameter for the array. and check if it is not outside of the boundry
		boolean [][] lifegrid = new boolean[20][20];
		
		for (int i=0; i<lifegrid.length; i++) {
			for (int j=0; j<lifegrid.length; j++) {
				
			}
		}
		
	}
	
	public static void classTest() {
		boolean [][] printBoolean= new boolean[10][10];
		
		for(int i=0; i <printBoolean.length; i++) {
			System.out.println(i);
			for(int j=0; j<printBoolean.length; j++) {
				System.out.print(j);
			}
		}
		
	}
	
	public static void zero() {
		int[] a = new int[18];
	    for (int i=0, j=0; i< a.length; i++)
	    {
	    		System.out.println(j);
//	       a[i] = j++;
//	       if(j == 3){
//	          j =0;
//	         
//	       }
	    }
	    System.out.println(Arrays.toString(a));
		
		}
	
	public static int findMin(int n1, int n2, int n3) {
		int[] arr = {n1, n2, n3};
		int mini = arr[0];
		for (int i =1; i <arr.length; i++) {
			if(mini > arr[i]) {
				mini = arr[i];
			}
		}
		return mini; 
	}
	
	
	 static double totalSum(double[] inputArray) {
		double totalSum = 0;
		for(int i=0; i<inputArray.length; i++) {
			totalSum += inputArray[i];
		}
		return totalSum;
	}
	 
	 public static double findAverage(double[] inArray) {
		 double totalSumOfArray = totalSum(inArray);
		 double averageOfArray = totalSumOfArray/inArray.length;
		 return averageOfArray;
	 }

}
