/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class Section05BinarySearchTrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ITree<Integer> tree = new BinarySearchTree<Integer>();
		IntStream.range(1, 10).forEach(val -> {
			tree.insert(val);
		});
		System.out.println("Max value is : " + tree.getMaxValue());
		System.out.println("Min value is : " + tree.getMinValue());
		tree.traves();

		tree.delete(5);

		System.out.println();
		tree.traves();
	}

}
