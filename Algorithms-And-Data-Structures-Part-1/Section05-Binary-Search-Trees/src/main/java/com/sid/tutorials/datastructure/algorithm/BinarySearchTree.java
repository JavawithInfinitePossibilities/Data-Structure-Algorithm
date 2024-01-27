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
public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {

	private TreeNode<T> root;

	@Override
	public void insert(T data) {
		if (root == null) {
			this.root = new TreeNode<T>(data);
		} else {
			insertNode(data, this.root);
		}
	}

	private void insertNode(T data, TreeNode<T> root) {
		if (data.compareTo(root.getData()) < 0) {
			if (root.getLeftChild() != null) {
				insertNode(data, root.getLeftChild());
			} else {
				TreeNode<T> leftChild = new TreeNode<T>(data);
				root.setLeftChild(leftChild);
			}
		} else if (data.compareTo(root.getData()) > 0) {
			if (root.getRightChild() != null) {
				insertNode(data, root.getRightChild());
			} else {
				TreeNode<T> rightChild = new TreeNode<T>(data);
				root.setRightChild(rightChild);
			}
		}
	}

	@Override
	public void delete(T data) {
		if (this.root != null) {
			this.root = delete(this.root, data);
		}
	}

	private TreeNode<T> delete(TreeNode<T> root, T data) {
		if (root == null) {
			return root;
		}
		if (data.compareTo(root.getData()) < 0) {
			root.setLeftChild(delete(root.getLeftChild(), data));
		} else if (data.compareTo(root.getData()) > 0) {
			root.setRightChild(delete(root.getRightChild(), data));
		} else {
			if (root.getLeftChild() == null && root.getRightChild() == null) {
				return null;
			}
			if (root.getLeftChild() == null) {
				TreeNode<T> tempNode = root.getRightChild();
				root = null;
				return tempNode;
			} else if (root.getRightChild() == null) {
				TreeNode<T> tempNode = root.getLeftChild();
				root = null;
				return tempNode;
			}
			TreeNode<T> predecesser = getPredecesser(root.getLeftChild());
			root.setData(predecesser.getData());
			root.setLeftChild(delete(predecesser.getLeftChild(), predecesser.getData()));
		}
		return root;
	}

	private TreeNode<T> getPredecesser(TreeNode<T> leftChild) {
		if (leftChild.getRightChild() != null) {
			return getPredecesser(leftChild.getRightChild());
		}
		return leftChild;
	}

	@Override
	public void traves() {
		if (root != null) {
			inOrderTraves(this.root);
		}
	}

	private void inOrderTraves(TreeNode<T> root) {
		if (root.getLeftChild() != null) {
			inOrderTraves(root.getLeftChild());
		}
		System.out.print(root + " ---> ");
		if (root.getRightChild() != null) {
			inOrderTraves(root.getRightChild());
		}
	}

	@Override
	public T getMaxValue() {
		if (this.root == null) {
			return null;
		}
		return getMax(this.root);
	}

	private T getMax(TreeNode<T> root) {
		if (root.getRightChild() != null) {
			return getMax(root.getRightChild());
		}
		return root.getData();
	}

	@Override
	public T getMinValue() {
		if (this.root == null) {
			return null;
		}
		return getMin(this.root);
	}

	private T getMin(TreeNode<T> root) {
		if (root.getLeftChild() != null) {
			return getMax(root.getLeftChild());
		}
		return root.getData();
	}

}
