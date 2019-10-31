package com.opportun.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractClassTest {

	@Test
	public void test() {
		SubClass sub = new SubClass();
		sub.method1();
		sub.method2();
	}
	
	abstract class SuperClass{
		
		int instanceVariable;
		private String hello = "Hello";
		
		public abstract void method1();
		
		public void method2() {
			System.out.println(hello + " I can have instructions");
		}
		
	}
	
	class SubClass extends SuperClass{

		@Override
		public void method1() {
			System.out.println("Need override this method");
		}
		
	}

}
