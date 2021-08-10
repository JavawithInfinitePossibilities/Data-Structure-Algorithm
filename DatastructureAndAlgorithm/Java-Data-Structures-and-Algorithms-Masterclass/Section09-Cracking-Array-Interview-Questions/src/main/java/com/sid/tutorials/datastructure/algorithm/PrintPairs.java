/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class PrintPairs {

	public void getPrintPair(int[] array, int sumValue) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] + array[j] == sumValue) {
					System.out.print("[" + array[i] + "," + array[j] + "]");
				}
			}
		}
	}
}
