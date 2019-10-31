package com.opportun.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterfaceTest {

	@Test
	public void test() {
		ClassConsumer consumer = new ClassConsumer();
		consumer.methodA();
		consumer.methodB();
	}
	
	interface InterfaceA{
		void methodA();
	}
	
	interface InterfaceB{
		void methodB();
	}
	
	class ClassConsumer implements InterfaceA, InterfaceB{
		public void methodA() {
			System.out.println("need override !");
		}
		
		public void methodB() {
			System.out.println("need respect to interface !");
		}
	}

}
