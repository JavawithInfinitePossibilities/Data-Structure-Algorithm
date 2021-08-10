/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class SumOfDigit {

	public int getSumOfDigit(int value) {
		if (value <= 0) {
			return 0;
		}
		return (value % 10) + getSumOfDigit(value / 10);

	}
}
