/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class Section11LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomLinkedList<Integer> customLinkedlist = new CustomLinkedList<Integer>();
		IntStream.range(0, 10).forEach(val -> customLinkedlist.insert(val));
		customLinkedlist.traverseList();

		customLinkedlist.remove(5);
		System.out.println();
		customLinkedlist.traverseList();
		System.out.println();
		customLinkedlist.reverse();
		System.out.println();
		customLinkedlist.getNthElementFromEnd(3);
	}

}
