/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 */
public class MissingNumber {

	public int findMissingnumber(int[] array) {
		int sum = Arrays.stream(array).sum();
		int actualSum = (array[array.length - 1] * (array[array.length - 1] + 1)) / 2;
		return actualSum - sum;
	}
}
