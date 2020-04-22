
/**
 * Description : casting between types 
 * 		
 * 	Author : Siva Charan
 * 	Email : siva3060@gmail.com
 */

import java.util.Scanner;

public class chp1ex5{

	public static void main(String args[]){

		// we cannot declare a double value and convert it to
		// int value as java does the type checking while assigning
		// but somehow it is takeing the data literal and 
		// can apply the casting dynamically
		Double  num = 10.24;
		int  duNum = (int) 10.24;

		System.out.println("The double values caseted to int is : "+ duNum);

		//cast the largest value of double to largest value an int can hold
		//Largest Double value  ==> 1.7976931348623157E308
		//Largest int  value  ==> 2147483647
		//

		int maxInt =  2147483647;

		System.out.println("The double values caseted to int is : "+ maxInt);

		//It is printing out the max of integer even after casting with larges double vale


		//end of method main
	}
	//end of class chp1ex1
}
