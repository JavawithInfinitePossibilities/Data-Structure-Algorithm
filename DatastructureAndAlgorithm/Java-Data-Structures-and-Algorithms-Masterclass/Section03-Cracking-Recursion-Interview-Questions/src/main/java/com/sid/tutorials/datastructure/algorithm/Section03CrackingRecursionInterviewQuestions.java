/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class Section03CrackingRecursionInterviewQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumOfDigit digit = new SumOfDigit();
		int sumOfDigit = digit.getSumOfDigit(587);
		System.out.println("Sum of digit is : " + sumOfDigit);

		PowerOfValue ofValue = new PowerOfValue();
		int calculatePowerOfValue = ofValue.calculatePowerOfValue(5, 3);
		System.out.println("Power of 3 of 5 is : " + calculatePowerOfValue);

		GCDCalculation calculation = new GCDCalculation();
		int calculateGCD = calculation.calculateGCD(48, 18);
		System.out.println("GCD of 2 value is : " + calculateGCD);

		DecimalToBinary binary = new DecimalToBinary();
		int decimalToBinary = binary.getDecimalToBinary(12);
		System.out.println("Decimal to binary : " + decimalToBinary);
	}

}
