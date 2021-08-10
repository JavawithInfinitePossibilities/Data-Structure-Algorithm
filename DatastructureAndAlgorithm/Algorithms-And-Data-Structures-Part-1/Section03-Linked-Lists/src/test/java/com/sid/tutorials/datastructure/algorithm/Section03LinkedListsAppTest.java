package com.sid.tutorials.datastructure.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Section03LinkedListsAppTest {

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testCustomLinkedlist() {
		CustomLinkedlist<Integer> customLinkedlist = new CustomLinkedlist<Integer>();
		IntStream.range(0, 10).forEach(val -> customLinkedlist.insert(val));
		customLinkedlist.traverseList();

		customLinkedlist.remove(5);
		System.out.println();
		customLinkedlist.traverseList();
		System.out.println();
		customLinkedlist.reverse();
		System.out.println();
		customLinkedlist.getNthElementFromEnd(3);
	}
}
