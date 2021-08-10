/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class ReverseArray {

	public void getReverse(int[] array) {
		for (int i = 0; i < (array.length / 2); i++) {
			int lastIndex = array.length - i - 1;
			int temp = array[i];
			array[i] = array[lastIndex];
			array[lastIndex] = temp;
		}
	}
}
