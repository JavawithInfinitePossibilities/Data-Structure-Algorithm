/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class DecimalToBinary {

	public int getDecimalToBinary(int value) {
		if (value == 0) {
			return 0;
		}
		return value % 2 + 10 * getDecimalToBinary(value / 2);
	}
}
