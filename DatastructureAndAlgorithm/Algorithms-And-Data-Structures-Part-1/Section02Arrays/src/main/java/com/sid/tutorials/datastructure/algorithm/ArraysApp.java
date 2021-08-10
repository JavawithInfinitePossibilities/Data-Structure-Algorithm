/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class ArraysApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayValue = new int[40];
		IntStream.rangeClosed(0, 10).forEach(val -> arrayValue[val] = val);
		System.out.println(Arrays.toString(arrayValue));

		/* Adding element is O(1) */
		arrayValue[25] = 25;
		System.out.println(Arrays.toString(arrayValue));

		/* Accessing random index element is O(1) */
		int value = arrayValue[9];
		System.out.println("Accessing random index :" + value);

		/* Accessing leaner search O(n) */
		Arrays.stream(arrayValue).filter(val -> {
			System.out.println("Value : " + val);
			boolean ret = false;
			if (val == 5) {
				ret = true;
			}
			return ret;
		}).forEach(val -> System.out.println("Accessing leaner search O(n) " + val));

	}

}
