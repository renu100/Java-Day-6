/* Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.*/
package com.DaySixProblems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CouponNumber {
	private static final Logger log = LogManager.getLogger(PrimeNumber.class);

	public static void main(String[] args) {
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max = 100000000;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();

		while (random > 0) {
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode = sb.toString();
		log.info("Coupon Code: " + couponCode);
	}
}
