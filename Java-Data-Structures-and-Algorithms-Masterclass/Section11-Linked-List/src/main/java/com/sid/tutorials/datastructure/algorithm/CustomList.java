/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public interface CustomList<T> {
	public void insert(T data);

	public void remove(T data);

	public void traverseList();

	public int size();

	public void reverse();

	public void getNthElementFromEnd(Integer data);
}
