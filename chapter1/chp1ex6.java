
/**
 * Description : Performing the 100! using BigInteger
 * 		
 * 	Author : Siva Charan
 * 	Email : siva3060@gmail.com
 */

import java.math.BigInteger;

public class chp1ex6{

	public static void main(String args[]){

		int bi = 1000;
		BigInteger result = BigInteger.ONE; 

		do{
			result = result.multiply(BigInteger.valueOf(bi));
			bi--;
		}while( bi >= 1);

		System.out.println("The factorial for 1000! is : "+ result);

	}
	//end of class chp1ex1
}
