/* Reverse a number
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.*/

package com.DaySixProblems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class ReverseNumber {

	private static final Logger log = LogManager.getLogger(PrimeNumber.class);

	public static void main(String[] args) {
		// Taking input from user
		Scanner scan = new Scanner(System.in);
		log.info("Enter any number");
		int number = scan.nextInt();

		// declare an integer value and initialization with 0 value
		int revers = 0;
		// Executes until the condition becomes false
		while (number != 0) {
			// calculating the reversed number
			number = number / 10;
			int reminder = number % 10;
			revers = revers * 10 + reminder;

		}
		log.info("Reversed number:-" + revers);

	}
}
