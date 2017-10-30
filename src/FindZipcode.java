import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author shankar
 *
 */
public class FindZipcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//prompt user to input the Zip code
		System.out.print("Enter the Zip Code: " );
		int userZipCode = scan.nextInt();
	
		
		while(userZipCode < 10000 || userZipCode > 99999) {
			System.err.print("Zip code must be 5 digit \n");			
			System.out.println("Please Enter 5 digit zip code: ");
			userZipCode = scan.nextInt();
		}
		
		scan.close();
		printBarCode(userZipCode);
		
	}
	
	public static int findTotalSum(int zipCode) {
		int zipSum = 0;
		 int rem;
		 while(zipCode > 0) {
			 rem  = zipCode % 10;
			 zipSum += rem;
			 zipCode = zipCode /10;
		 }
		 return zipSum;
	}
	
	public static void printBarCode(int zipCode) {
		
		int sumZip = findTotalSum(zipCode);
		 
		 
		 int checkDigit = returnCheckDigit(zipSum);
		 
		 System.out.print("|");
		 for(int i=0; i<5; i++) {
			
			 int remaining = zipCode / 100000; 
			//printDigit(remaining);
			System.out.print(remaining);
		 }
		 System.out.print("|");
		//System.out.println(zipSum);
		//System.out.println(checkDigit);
	}
	
	public static int returnCheckDigit(int chkDigit) {
		int rem = chkDigit % 10;
		int checkDigit = 10 - rem;
		
		return checkDigit;
	}
	
	
	public static void printDigit(int d) {
		String barOutput = "";
		switch (d) {
			case 0: 	barOutput = "||:::"; break;
			case 1: 	barOutput = ":::||"; break;
			case 2: 	barOutput = "::|:|"; break;
			case 3: 	barOutput = "::||:"; break;
			case 4: 	barOutput = ":|::|"; break;
			case 5: 	barOutput = ":|:|:"; break;
			case 6: 	barOutput = ":||::"; break;
			case 7: 	barOutput = "|:::|"; break;
			case 8: 	barOutput = "|::|:"; break;
			case 9: 	barOutput = "|:|::"; break;
		}
		
		System.out.print(barOutput);
			
	}
	
	
}
