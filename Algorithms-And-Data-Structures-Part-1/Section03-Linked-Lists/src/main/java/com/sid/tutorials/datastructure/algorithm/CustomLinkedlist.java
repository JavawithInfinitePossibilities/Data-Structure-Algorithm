/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class CustomLinkedlist<T extends Comparable<T>> implements CustomList<T> {

	private CustomNode<T> root;
	private int sizeOfList;

	@Override
	public void insert(T data) {
		++this.sizeOfList;
		if (root == null) {
			root = new CustomNode<>(data);
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

	/*O(1)*/
	private void insertAtEnd(T data, CustomNode<T> node) {
		if (node.getNextNode() != null) {
			insertAtEnd(data, node.getNextNode());
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
			this.root = null;
			--this.sizeOfList;
		} else {
			remove(data, root, root.getNextNode());
		}
	}

	private void remove(T data, CustomNode<T> previous, CustomNode<T> current) {
		while (current != null) {
			if (current.getData().compareTo(data) == 0) {
				previous.setNextNode(current.getNextNode());
				current = null;
				--this.sizeOfList;
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
		CustomNode<T> currentNode = this.root;
		while (currentNode != null) {
			System.out.print(currentNode + " -> ");
			currentNode = currentNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}

	@Override
	public void reverse() {
		if (this.root == null) {
			System.out.println("Can't reverse the linkedlist!!!");
		}
		this.root = nodeSwapping(this.root);
		traverseList();
	}

	private CustomNode<T> nodeSwapping(CustomNode<T> localLinkedlist) {
		CustomNode<T> previous = null;
		CustomNode<T> current = localLinkedlist;
		CustomNode<T> nextCustomNode = null;
		while (current != null) {
			nextCustomNode = current.getNextNode();
			current.setNextNode(previous);
			previous = current;
			current = nextCustomNode;
		}
		localLinkedlist = previous;
		return localLinkedlist;
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
