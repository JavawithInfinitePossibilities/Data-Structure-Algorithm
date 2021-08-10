/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class ArraylistApp {
	/* 1. Random access is O(1)
	 * 2. It is equivalent to Vector but not synchronized. 
	 * 3. All operation run in O(1).
	 * 4. Adding and Removing element at the end is O(1).
	 * 5. Adding and Removing element at random index is O(n).
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> value = new ArrayList<Integer>();
		/* Adding element at the end */
		long starttime = System.currentTimeMillis();
		IntStream.rangeClosed(0, 1_00_000).forEach(val -> value.add(val));
		System.out.println("Total time taken to add at end :" + (System.currentTimeMillis() - starttime));

		starttime = System.currentTimeMillis();
		IntStream.rangeClosed(0, 1_00_000).forEach(val -> value.add(5, val));
		System.out.println("Total time taken to add at beginning:" + (System.currentTimeMillis() - starttime));
		System.out.println("The size of the array list : " + value.size());

		starttime = System.currentTimeMillis();
		value.remove(99_999);
		System.out.println("Total time taken to removing at end:" + (System.currentTimeMillis() - starttime));
		System.out.println("The size of the array list : " + value.size());

		starttime = System.currentTimeMillis();
		value.remove(5000);
		System.out.println("Total time taken to removing at beginning:" + (System.currentTimeMillis() - starttime));
		System.out.println("The size of the array list : " + value.size());

		Iterator<Integer> iterator = value.iterator();
		while (iterator.hasNext()) {
			Integer val = (Integer) iterator.next();
			if (val == 1500) {
				iterator.remove();
			}
		}
		System.out.println("The size of the array list : " + value.size());
	}

}
