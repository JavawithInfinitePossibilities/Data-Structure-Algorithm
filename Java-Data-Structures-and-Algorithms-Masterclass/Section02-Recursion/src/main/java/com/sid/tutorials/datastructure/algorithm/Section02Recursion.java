/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class Section02Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactorialRecursion recursion = new FactorialRecursion();
		int factorialByRecursion = recursion.factorialByRecursion(-5);
		System.out.println("Factorial of 5 is : " + factorialByRecursion);

		FebonacciSeries febonacciSeries = new FebonacciSeries();
		int calculateFebonacci = febonacciSeries.calculateFebonacci(5);
		System.out.println("Febonacci series value : " + calculateFebonacci);

	}

}
