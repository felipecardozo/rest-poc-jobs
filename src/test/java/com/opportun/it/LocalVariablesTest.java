package com.opportun.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocalVariablesTest {

	static int VARIABLE_CLASE = 100;
	String instanceVariable = "my string";
	
	@Test
	public void test() {
		int varLocal1 = 10;
		int varLocal2 = 100;
		
		if( varLocal2 == 100 ) {
			int varLocal3 = 1000;
		}
		
	}
}

