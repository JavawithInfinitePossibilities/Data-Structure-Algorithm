/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public interface ITree<T> {

	public void insert(T data);

	public void delete(T data);

	public void traves();

	public T getMaxValue();

	public T getMinValue();

}
