/* Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28*/

package com.DaySixProblems;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PerfectNumber {
	private static final Logger log = LogManager.getLogger(PerfectNumber.class);

	public static void main(String[] args) {
		// taking input from user
		Scanner scan = new Scanner(System.in);

		log.info("Enter a number");
		int number = scan.nextInt();

		// Declare a value and initialization
		int i = 1, sum = 0;

		// executes until the condition becomes false
		while (i <= number / 2) {
			if (number % i == 0) {

				// calculates the sum of factors
				sum = sum + i;
				log.info(sum);
			} // end of if
				// after each iteration, increments the value of variable i by 1
			i++;
		} // end of while
			// compares sum with the number
		if (sum == number) {
			// prints if sum and number are equal
			log.info(number + " is a perfect number.");
		} // end of if
		else
			// prints if sum and number are not equal
			log.info(number + " is not a perfect number.");
	}
}
