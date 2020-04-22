
/**
 * Description : Program  to read integer and print in
 * 		- Binary
 * 		- Octal
 * 		- HexaDecimal
 * 		- Reciprocal as HexaDecimal Floating point Number
 * 	Author : Siva Charan
 * 	Email : siva3060@gmail.com
 */

import java.util.Scanner;

public class chp1ex1{

	public static void main(String args[]){
	
		//Read an integer 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to do conversion :");
		int input = sc.nextInt();

		//Printing the input into various different formats
		//
		//We will use the java library method to perform the 
		//conversion

		System.out.println("Binary Format :"+Integer.toBinaryString(input));
		System.out.println("Hex Format :"+Integer.toHexString(input));
		System.out.println("Octal Format :"+Integer.toOctalString(input));

		//end of method main
	}
	//end of class chp1ex1
}
