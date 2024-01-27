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
public class Section06CrackingBigOInterviewQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		IntStream.rangeClosed(1, 10).forEach(val -> array[val - 1] = val);
		System.out.println(Arrays.toString(array));
		SumProductOfArray sumProductOfArray = new SumProductOfArray();
		System.out.println();
		sumProductOfArray.getSumProductOfArray(array);
		System.out.println("Sum : " + sumProductOfArray.sum + " Product : " + sumProductOfArray.product);

		PrintPairs pairs = new PrintPairs();
		pairs.getPrintPair(array);
		System.out.println();
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.getReverse(array);
		System.out.println(Arrays.toString(array));
	}

}
