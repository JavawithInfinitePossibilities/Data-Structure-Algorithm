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
public class CustomNode<T extends Comparable<T>> {
	private T data;
	private CustomNode<T> nextNode;

	public CustomNode(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
}
