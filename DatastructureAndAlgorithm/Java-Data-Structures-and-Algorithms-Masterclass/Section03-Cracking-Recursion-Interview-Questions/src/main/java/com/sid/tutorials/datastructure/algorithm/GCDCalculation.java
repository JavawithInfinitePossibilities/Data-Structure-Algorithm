/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class GCDCalculation {

	public int calculateGCD(int val1, int val2) {
		if (val1 < 0 || val2 < 0) {
			return -1;
		}
		if (val2 == 0) {
			return val1;
		}
		return calculateGCD(val2, val1 % val2);
	}
}
