/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Lenovo
 *
 */
public class DijkstraAlgorithm {

	private Stack<String> operator;
	private Stack<Double> valueStack;

	public DijkstraAlgorithm() {
		super();
		this.operator = new Stack<>();
		this.valueStack = new Stack<>();
	}

	public void getValueFromExpression(String expression) {
		String[] values = expression.split(" ");

		Arrays.stream(values).forEach(value -> {
			operation(value);
		});
	}

	private void operation(String value) {
		switch (value) {
		case "(":
			break;
		case ")":
			String pop = this.operator.pop();
			switch (pop) {
			case "+":
				this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
				break;
			case "*":
				this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
				break;
			}
			break;
		case "+":
			this.operator.push(value);
			break;
		case "*":
			this.operator.push(value);
			break;
		default:
			this.valueStack.push(Double.parseDouble(value.trim()));
			break;
		}
	}

	public Double result() {
		return this.valueStack.pop();
	}
}
