import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] arr1 = {a0, a1, a2};
        int[] arr2 = {b0, b1, b2};
       
       for(int i=0; i < arr1.length; i++){
         
          
       }
       return arr1;
      
        
        
        //int pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0);
    //int pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0);

    //return new int[] {pointsAlice, pointsBob};
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a0 = in.nextInt();
//        int a1 = in.nextInt();
//        int a2 = in.nextInt();
//        int b0 = in.nextInt();
//        int b1 = in.nextInt();
//        int b2 = in.nextInt();
//        int[] result = solve(a0, a1, a2, b0, b1, b2);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
//        }
//        System.out.println("");
        
    	exceptionpractice();
    }
    
    public static void exceptionpractice() {
   
    	int[] abc = {1,2,3,4,5,6,7};
    	for(int i=0; i<abc.length+11; i++) {
    		System.out.println(abc[i]);
    	}
   
    	
    	
    }
    
    public static int sumofnumber(int ... values) {
    	int total = 0;
    	for(int i=0; i <values.length; i++) {
    		total += values[i];
    	}
    	return total;
    }
}
