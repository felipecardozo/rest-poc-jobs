package com.opportun.it;

import static org.junit.Assert.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.Test;

public class AnnotationTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	@interface MyAnnotation{
		String someMethod();
	}
	
	@MyAnnotation(someMethod = "here goes metadata")
	class ClassA{
		
	}

}
