/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class Section03LinkedListsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> values = new LinkedList<Integer>();
		/* Adding element at beginning of the linkedlist at O(1) */
		long starttime = System.currentTimeMillis();
		IntStream.range(0, 1_00_000).forEach(val -> values.addFirst(val));
		System.out.println("Total time taken to add at beginning :" + (System.currentTimeMillis() - starttime));

		/* Adding element at end of the linkedlist at O(n) */
		starttime = System.currentTimeMillis();
		IntStream.range(0, 1_00_000).forEach(val -> values.addLast(val));
		System.out.println("Total time taken to add at end :" + (System.currentTimeMillis() - starttime));
		System.out.println("Size of the linkedlist :" + values.size());

		/* Removing element at beginning of the linkedlist at O(1) */
		starttime = System.currentTimeMillis();
		values.removeFirst();
		System.out.println("Total time taken to remove at beginning :" + (System.currentTimeMillis() - starttime));

		/* Removing element at end of the linkedlist at O(n) */
		starttime = System.currentTimeMillis();
		values.removeLast();
		System.out.println("Total time taken to remove at end :" + (System.currentTimeMillis() - starttime));
	}

}
