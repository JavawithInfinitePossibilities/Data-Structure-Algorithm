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
public class Section09CrackingArrayInterviewQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] missingArray = IntStream.range(0, 100).filter(value -> !(value == 56)).map(value -> value + 1).toArray();
		MissingNumber missingNumber = new MissingNumber();
		System.out.println("The missing number is : " + missingNumber.findMissingnumber(missingArray));
		int[] pairArray = IntStream.range(0, 10).map(value -> value).toArray();
		PrintPairs pairs = new PrintPairs();
		pairs.getPrintPair(pairArray, 11);
		System.out.println();
		int[] pairArrayProduct = IntStream.range(0, 10).map(value -> value).toArray();
		PrintPairsToProduceMaxproduct maxproduct = new PrintPairsToProduceMaxproduct();
		maxproduct.getPrintPair(pairArrayProduct);

		int[][] rotateArray = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		Arrays.stream(rotateArray).forEach(value -> {
			System.out.println(Arrays.toString(value));
		});
		RotateArray rotate = new RotateArray();
		int[][] result = rotate.rotate(rotateArray);
		Arrays.stream(result).forEach(value -> {
			System.out.println(Arrays.toString(value));
		});
		System.out.println("----------------------");
		int[][] rotateMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Rotate Matrix : " + Arrays.deepToString(rotateMatrix));
		rotate.rotateMatrix(rotateMatrix);
		System.out.println("Rotate Matrix : " + Arrays.deepToString(rotateMatrix));
	}

}
