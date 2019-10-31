package com.opportun.it;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(40);
		numbers.add(400);
		
		numbers.get(1); //returns 40
		
		numbers.remove(0);	//numbers now have [40, 400]
		
		numbers.sort(Comparator.reverseOrder());
		//numbers now have [400, 40]
		
		System.out.println(numbers);//numbers now have [400, 40]
		
		
	}

	@Test
	public void test2() {
		
		List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9, 10, 15);
		
		List<Integer> pairs = numbers
				.stream()
				.filter(number-> number%2==0)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(pairs);
	}
	
}
