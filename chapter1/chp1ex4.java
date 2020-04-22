
/**
 * Description : Printing the smallest and largest double values 
 * 		
 * 	Author : Siva Charan
 * 	Email : siva3060@gmail.com
 */

import java.util.Scanner;

public class chp1ex4{

	public static void main(String args[]){

		 System.out.println(Double.MIN_VALUE);
		 System.out.println(Double.MAX_VALUE);

		 //using the next up and nextDown methods of math to push to find the next 
		 //avaliable limit 
		 
		 System.out.println(Math.nextDown(Double.MIN_VALUE));
		 System.out.println(Math.nextUp(Double.MAX_VALUE));


		//end of method main
	}
	//end of class chp1ex1
}
