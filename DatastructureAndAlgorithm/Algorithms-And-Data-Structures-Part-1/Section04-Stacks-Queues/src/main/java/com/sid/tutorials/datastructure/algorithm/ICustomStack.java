/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public interface ICustomStack<T> {
	public void push(T data);

	public void pop();

	public int size();

	public boolean isEmpty();
}
