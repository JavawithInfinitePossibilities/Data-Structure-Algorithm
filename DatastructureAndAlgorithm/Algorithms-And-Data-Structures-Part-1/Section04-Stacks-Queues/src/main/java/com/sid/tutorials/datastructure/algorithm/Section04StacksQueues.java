/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class Section04StacksQueues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomStack<Integer> customStack = new CustomStack<Integer>();
		IntStream.range(0, 10).forEach(val -> customStack.push(val));

		System.out.println("Stack size : " + customStack.size());
		customStack.pop();

		System.out.println("Stack size : " + customStack.size());

	}

}
