/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class FactorialRecursion {

	public int factorialByRecursion(int value) {
		if (value < 1) {
			return -1;
		}
		if (value == 1 || value == 0) {
			return 1;
		}
		return value * factorialByRecursion(value - 1);
	}
}
