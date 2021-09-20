/* Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1). */

package com.DaySixProblems;

import java.util.Scanner;
import org.apache.logging.log4j.*;
//import org.apache.logging.log4j.Logger;

public class FibonacciSeries {
	private static final Logger log = LogManager.getLogger(FibonacciSeries.class);

	public static void main(String[] args) {
		int temp1 = 0, temp2 = 1;
		int Sum;
		//Taking Input From User
		Scanner scan = new Scanner(System.in);
		log.info("Enter a number");
		int number = scan.nextInt();
	
		log.info(temp1 + "," + temp2);
		//Executes until the condition becomes false 
		for (int i = 0; i <= number; i++) {
			Sum = temp1 + temp2;

			log.info(Sum + ",");
			temp1 = temp2;
			temp2 = Sum;
		}

	}

}
