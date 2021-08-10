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
public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		int[][] twoDArray = IntStream.range(0, row).mapToObj(val -> IntStream.range(0, column).map(value -> {
			//System.out.println("Value : " + value);
			return (int) (value * (Math.random() * 20));
		}).toArray()).toArray(int[][]::new);
		Arrays.stream(twoDArray).forEach(val -> {
			System.out.println(Arrays.toString(val));
		});
		System.out.println();
		System.out.println(Arrays.deepToString(twoDArray));
	}

}
