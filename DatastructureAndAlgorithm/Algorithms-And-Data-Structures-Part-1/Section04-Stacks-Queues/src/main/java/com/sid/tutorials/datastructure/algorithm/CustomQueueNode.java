package com.sid.tutorials.datastructure.algorithm;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomQueueNode<T extends Comparable<T>> {

	private T data;
	private CustomQueueNode<T> nextNode;

	public CustomQueueNode(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
}
