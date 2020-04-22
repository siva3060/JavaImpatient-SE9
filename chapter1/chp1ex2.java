
/**
 * Description : Normalise the given angle between 0-359
 * 		 +/- values 
 * 	Author : Siva Charan
 * 	Email : siva3060@gmail.com
 */

import java.util.Scanner;

public class chp1ex2{

	public static void main(String args[]){
	
		//Read an integer 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle to be normalied :");
		double  input = sc.nextDouble();

		//we will format the data for handling the double precision
		//  %<number>.<mantis><datatype>
		//  <d> integer
		//  <f> float
		//  <f> float
		if( input < 359 && input > -359){ 
			System.out.printf("The normalised Angle is %.2f\n", input);
		}else{

			Double normalised = input%359.0;
			System.out.printf("The normalised Angle is %.2f\n", normalised);
		}

	}
	//end of class chp1ex1
}
