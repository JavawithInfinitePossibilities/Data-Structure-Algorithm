/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class CustomArrayStack<T> implements ICustomStack<T> {

	private T[] data;
	private int sizeOfStack;

	public CustomArrayStack() {
		this.data = (T[]) new Object[1];
	}

	@Override
	public void push(T data) {
		if (this.data.length == this.sizeOfStack) {
			resize(2 * this.data.length);
		}
		this.data[sizeOfStack++] = data;
	}

	private void resize(int capacity) {
		T[] dataCopy = (T[]) new Object[capacity];
		System.arraycopy(data, 0, dataCopy, 0, sizeOfStack);
		this.data = dataCopy;
	}

	@Override
	public void pop() {
		T popElement = null;
		if ((this.sizeOfStack > 0) && (this.sizeOfStack == (this.data.length / 4))) {
			resize(this.data.length / 2);
		}
		popElement = this.data[this.sizeOfStack--];
	}

	@Override
	public int size() {
		return this.sizeOfStack;
	}

	@Override
	public boolean isEmpty() {
		return this.sizeOfStack == 0;
	}

}
