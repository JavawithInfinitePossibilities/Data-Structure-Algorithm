/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class PowerOfValue {

	public int calculatePowerOfValue(int power, int exp) {
		if (power < 0 || exp < 0) {
			return 0;
		}
		if (exp == 0) {
			return power;
		}
		return power * calculatePowerOfValue(power, exp - 1);
	}
}
