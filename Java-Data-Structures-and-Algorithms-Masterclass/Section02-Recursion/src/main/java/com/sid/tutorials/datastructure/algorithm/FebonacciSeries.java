/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class FebonacciSeries {

	public int calculateFebonacci(int value) {
		if (value < 0) {
			return -1;
		}
		if (value == 1 || value == 0) {
			return value;
		}
		return calculateFebonacci(value - 1) + calculateFebonacci(value - 2);

	}
}
