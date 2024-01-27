/**
 * 
 */
package com.sid.tutorials.datastructure.algorithm;

/**
 * @author Lenovo
 *
 */
public class RotateArray {
	public int[][] rotate(int[][] array) {
		int[][] rotatedArray = new int[array[0].length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				rotatedArray[j][i] = array[i][j];
			}
		}
		return rotatedArray;
	}

	public boolean rotateMatrix(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) {
			return false;
		}
		int length = matrix.length;
		for (int layar = 0; layar < length / 2; layar++) {
			int first = 0;
			int last = length - 1 - layar;
			for (int i = 0; i < last; i++) {
				int offSet = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offSet][first];
				matrix[last - offSet][first] = matrix[last][last - offSet];
				matrix[last][last - offSet] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		return true;
	}
}
