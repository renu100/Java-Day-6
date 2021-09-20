package com.DaySixProblems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Stopwatch {
	private static final Logger log = LogManager.getLogger(PrimeNumber.class);

	public static void main(String[] args) {
		log.info("Press any key to start stopwatch");
		Scanner scan = new Scanner(System.in);
		char x = scan.next().charAt(0);
		double start = Stopwatch.start();

		log.info("Press any key to stop stopwatch");
		char y = scan.next().charAt(0);
		double stop = Stopwatch.stop();
		log.info("Time: " + (stop - start) + " ms");
	}

	public static double start() {
		double start = System.currentTimeMillis();
		log.info("start :-" + start);
		return start;
	}

	public static double stop() {
		double stop = System.currentTimeMillis();
		log.info("End :- " + stop);
		return stop;
	}

}
