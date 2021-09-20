/* Prime Number
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.*/

package com.DaySixProblems;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimeNumber {
	private static final Logger log = LogManager.getLogger(PrimeNumber.class);

	public static void main(String[] args) {
		// Taking input from user
		Scanner scan = new Scanner(System.in);
		log.info("Enter any number");
		int number = scan.nextInt();

		// declare an integer value and initialization with 0 value
		int count = 0;

		// Executes until the condition becomes false
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				count = count + 1;
			}
		}
		// If count is 1 then the number is not prime else it is prime
		if (count > 0) {
			log.info(number + " " + "is not prime number");
		} else {
			log.info(number + " " + "is prime number");
		}

	}

}
