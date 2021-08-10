/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Lenovo
 *
 */
@Getter
@Setter
public class TreeNode<T> {

	private TreeNode<T> leftChild;
	private T data;
	private TreeNode<T> rightChild;
	private int hight;

	public TreeNode(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}
}
