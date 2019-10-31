package com.opportun.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void test() {
		
		int[] numbers = new int[3];
		numbers[0] = 100;
		numbers[1] = 101;
		numbers[2] = 102;
		
		System.out.println(numbers);
		
	}
	
	@Test
	public void test2() {
		
		double [][] array2d = new double[2][2];
		array2d[0][0] = 1;
		array2d[0][1] = 2;
		array2d[1][0] = 3;
		array2d[1][1] = 4;
	}

	@Test
	public void test3() {
		
		String[][][] array3d = new String[][][]{
				{{"A", "A", "A"}, {"B", "B", "B"}, {"V", "V", "V"} },
				{{"A", "A", "A"}, {"B", "B", "B"}, {"V", "V", "V"} },
				{{"A", "A", "A"}, {"B", "B", "V"}, {"B", "V", "V"} }
		};
		
		System.out.println(array3d);
	}
	
}
