/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class PrintPairsToProduceMaxproduct {

	public void getPrintPair(int[] array) {
		int maxProduct = 1;
		String pair = null;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] * array[j] > maxProduct) {
					maxProduct = array[i] * array[j];
					pair = "[" + array[i] + "," + array[j] + "]";
				}
			}
		}
		System.out.println("The Pair is : " + pair);
	}
}
