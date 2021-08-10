/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 */
public class SumProductOfArray {
	public int sum = 0;
	public int product = 1;

	public void getSumProductOfArray(int[] array) {
		if (array != null) {
			Arrays.stream(array).forEach(val -> this.sum += val);
			Arrays.stream(array).forEach(val -> this.product *= val);
		}
	}
}
