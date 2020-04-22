
/**
 * Description : 
 * 		-
 * 	Author : Siva Charan
 * 	Email : siva3060@gmail.com
 */

import java.util.Scanner;

public class chp1ex3{

	public static void main(String args[]){
	
		//Read an three integers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers to do conversion : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//big of three using conditional operator 
		// A conditional operator always  returns some thing based on the condition
	
	
System.out.println("The biggest of the three is : "+(a > b ? (a > c ?  a : c ) : (b > c ? b : c)));

		//end of method main
	}
	//end of class chp1ex1
}
