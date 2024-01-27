/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class AVLBinaryTree<T extends Comparable<T>> implements ITree<T> {

	private TreeNode<T> root;

	@Override
	public void insert(T data) {
		this.root = insertNode(this.root, data);
	}

	private TreeNode<T> insertNode(TreeNode<T> root, T data) {
		if (root == null) {
			return new TreeNode<T>(data);
		}
		if (root.getData().compareTo(data) > 0) {
			root.setLeftChild(insertNode(root.getLeftChild(), data));
		} else {
			root.setRightChild(insertNode(root.getRightChild(), data));
		}
		root.setHight(Math.max(hight(root.getLeftChild()), hight(root.getRightChild())) + 1);

		root = checkBalance(data, root);

		return root;
	}

	private TreeNode<T> checkBalance(T data, TreeNode<T> root) {
		int balance = getBalance(root);
		if (balance > 1 && root.getLeftChild().getData().compareTo(data) > 0) {
			return rightRotation(root);
		} else if (balance < -1 && root.getRightChild().getData().compareTo(data) < 0) {
			return leftRotation(root);
		} else if (balance > 1 && root.getLeftChild().getData().compareTo(data) < 0) {
			root.setLeftChild(leftRotation(root.getLeftChild()));
			return rightRotation(root);
		} else if (balance < -1 && root.getRightChild().getData().compareTo(data) > 0) {
			root.setRightChild(rightRotation(root.getRightChild()));
			return leftRotation(root);
		}
		return root;
	}

	private TreeNode<T> rightRotation(TreeNode<T> node) {
		TreeNode<T> tempRootNode = node.getLeftChild();
		TreeNode<T> tempNode = tempRootNode.getRightChild();

		tempRootNode.setRightChild(node);
		node.setLeftChild(tempNode);

		node.setHight(Math.max(hight(node.getLeftChild()), hight(node.getRightChild())) + 1);
		tempRootNode.setHight(Math.max(hight(tempRootNode.getLeftChild()), hight(tempRootNode.getRightChild())) + 1);
		return tempRootNode;
	}

	private TreeNode<T> leftRotation(TreeNode<T> node) {
		TreeNode<T> tempRootNode = node.getRightChild();
		TreeNode<T> tempNode = tempRootNode.getLeftChild();

		tempRootNode.setLeftChild(node);
		node.setRightChild(tempNode);

		node.setHight(Math.max(hight(node.getLeftChild()), hight(node.getRightChild())) + 1);
		tempRootNode.setHight(Math.max(hight(tempRootNode.getLeftChild()), hight(tempRootNode.getRightChild())) + 1);
		return tempRootNode;
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
		root.setHight(Math.max(hight(root.getLeftChild()), hight(root.getRightChild())) + 1);

		TreeNode<T> setBalance = setBalance(root);
		return setBalance;
	}

	private TreeNode<T> setBalance(TreeNode<T> root) {
		int balance = getBalance(root);
		if (balance > 1) {
			if (getBalance(root.getLeftChild()) < 0) {
				root.setLeftChild(leftRotation(root.getLeftChild()));
			}
			return rightRotation(root);
		}

		if (balance < -1) {
			if (getBalance(root.getRightChild()) > 0) {
				root.setRightChild(rightRotation(root.getRightChild()));
			}
			TreeNode<T> leftRotation = leftRotation(root);
			return leftRotation;
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
		if (this.root == null) {
			return;
		}
		inOrderTravers(this.root);
	}

	private void inOrderTravers(TreeNode<T> root) {
		if (root.getLeftChild() != null) {
			inOrderTravers(root.getLeftChild());
		}
		System.out.print(root + " --> ");
		if (root.getRightChild() != null) {
			inOrderTravers(root.getRightChild());
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
		if (root != null) {
			getMax(root.getRightChild());
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
			getMin(root.getLeftChild());
		}
		return root.getData();
	}

	private int hight(TreeNode<T> node) {
		if (node == null) {
			return -1;
		}
		return node.getHight();
	}

	private int getBalance(TreeNode<T> node) {
		if (node == null) {
			return 0;
		}
		return hight(node.getLeftChild()) - hight(node.getRightChild());
	}

}
