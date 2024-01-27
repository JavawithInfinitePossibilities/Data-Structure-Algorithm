/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class Section06BalancedTreesAVLTrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ITree<Integer> avlTree = new AVLBinaryTree<Integer>();

		avlTree.insert(10);
		avlTree.insert(15);
		avlTree.insert(5);
		avlTree.insert(14);
		avlTree.traves();
		avlTree.delete(5);
		System.out.println();
		avlTree.traves();
	}

}
