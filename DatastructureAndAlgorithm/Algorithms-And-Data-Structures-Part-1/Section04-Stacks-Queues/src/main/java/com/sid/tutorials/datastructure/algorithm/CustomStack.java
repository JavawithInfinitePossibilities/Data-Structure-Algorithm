/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class CustomStack<T extends Comparable<T>> implements ICustomStack<T> {

	private CustomNode<T> node;
	private int sizeOfStack;

	@Override
	public void push(T data) {
		if (this.node == null) {
			this.node = new CustomNode<T>(data);
		} else {
			CustomNode<T> newNode = new CustomNode<T>(data);
			this.node.setNextNode(newNode);
		}
		++this.sizeOfStack;
	}

	@Override
	public void pop() {
		CustomNode<T> localNode = this.node.getNextNode();
		this.node = localNode;
		--this.sizeOfStack;
	}

	@Override
	public int size() {
		return this.sizeOfStack;
	}

	@Override
	public boolean isEmpty() {
		return this.node == null;
	}

}
