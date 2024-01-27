/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class DaysTemperture {

	public void getTemperature() {
		AtomicInteger counter = new AtomicInteger();
		counter.set(0);
		Scanner consol = new Scanner(System.in);
		System.out.println("Please enter the number of days' you want to save temperature : ");
		int numDays = consol.nextInt();
		int[] temperatureDetails = IntStream.range(0, numDays).map(value -> {
			System.out.println("Please enter the temperature for day - " + value);
			int temp = consol.nextInt();
			return temp;
		}).toArray();
		double average = Arrays.stream(temperatureDetails).mapToDouble(val -> val).average().orElse(0.0);
		Arrays.stream(temperatureDetails).filter(value -> value > average).forEach(value -> {
			counter.incrementAndGet();
		});
		System.out.println("Number of days above the average temperature is : " + counter.get());
	}
}
