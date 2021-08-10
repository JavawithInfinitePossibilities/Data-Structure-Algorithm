package com.sid.tutorials.datastructure.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Section04StacksQueuesTest {

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	public void testCustomArrayStack() {
		CustomArrayStack<Integer> customArrayStack = new CustomArrayStack<Integer>();
		IntStream.range(0, 11).forEach(val -> customArrayStack.push(val));
		System.out.println("Size of the stack : " + customArrayStack.size());

		customArrayStack.pop();
		customArrayStack.pop();

		System.out.println("Size of the stack : " + customArrayStack.size());
	}

	@Disabled
	@Test
	public void getResultByDijkstraAlgorithm() {
		DijkstraAlgorithm algorithm = new DijkstraAlgorithm();
		algorithm.getValueFromExpression("( ( 1 + 2 ) * ( 1 + 2 ) )");
		System.out.println(algorithm.result());
	}

	@Test
	public void getQueue() {
		CustomQueue<Integer> queue = new CustomQueue<Integer>();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println(queue.dequeue());

		System.out.println(queue.size());
	}
}
