/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class CustomLinkedList<T extends Comparable<T>> implements CustomList<T> {

	private CustomNode<T> root;
	private int sizeOfList;

	@Override
	public void insert(T data) {
		sizeOfList++;
		if (this.root == null) {
			this.root = new CustomNode<T>(data);
		} else {
			insertAtBeginning(data);
		}
	}

	/* O(1)*/
	private void insertAtBeginning(T data) {
		CustomNode<T> newNode = new CustomNode<T>(data);
		newNode.setNextNode(root);
		this.root = newNode;
	}

	private void insertAtEnd(T data, CustomNode<T> node) {
		if (node.getNextNode() != null) {
			insertAtEnd(data, this.root.getNextNode());
		} else {
			CustomNode<T> newNode = new CustomNode<T>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		if (this.root == null) {
			return;
		}
		if (this.root.getData().compareTo(data) == 0) {
			this.sizeOfList--;
			this.root = this.root.getNextNode();
		} else {
			remove(data, root, root.getNextNode());
		}
	}

	private void remove(T data, CustomNode<T> previous, CustomNode<T> current) {
		while (current != null) {
			if (current.getData().compareTo(data) == 0) {
				previous.setNextNode(current.getNextNode());
				current = null;
				this.sizeOfList--;
				return;
			}
			previous = current;
			current = current.getNextNode();
		}

	}

	@Override
	public void traverseList() {
		if (this.root == null) {
			return;
		}
		CustomNode<T> current = this.root;
		while (current != null) {
			System.out.print(current.getData() + " --> ");
			current = current.getNextNode();
		}
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}

	@Override
	public void reverse() {
		if (this.root == null) {
			return;
		} else {
			this.root = nodeSwapping(this.root);
		}
	}

	private CustomNode<T> nodeSwapping(CustomNode<T> root) {
		CustomNode<T> previous = null, nextNode = null, current = root;
		while (current != null) {
			nextNode = current.getNextNode();
			current.setNextNode(previous);
			previous = current;
			current = nextNode;
		}
		root = previous;
		return root;
	}

	@Override
	public void getNthElementFromEnd(Integer data) {
		if (data > this.sizeOfList) {
			System.out.println("Can't find the element!!!");
			return;
		}
		Integer nthElement = this.sizeOfList - data;
		int count = 0;
		CustomNode<T> previous = null;
		CustomNode<T> current = this.root;
		CustomNode<T> next = null;
		while (current != null && !nthElement.equals(count++)) {
			next = current.getNextNode();
			current.setNextNode(previous);
			previous = current;
			current = next;
		}
		System.out.println(data + "th element is : " + current.getData());
	}

}
