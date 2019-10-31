package com.opportun.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class HerenciaTest {

	@Test
	public void test() {
		ClassB classB = new ClassB();
		classB.myFunction();
	}
	
	class ClassA{
		public void myFunction() {
			System.out.println("Im your father!");
		}
	}
	
	class ClassB extends ClassA{
		
	}
	

}
