package com.sample;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class MyCalculatorTest {
    
	
	@Test public void testAdd()
	{
		System.out.println("test4");
		MyCalculator myCalcul = new MyCalculator();
		assertEquals(30, myCalcul.add(20, 10));
	}
	
	@Test public void testTestMethod() {
        MyCalculator classUnderTest = new MyCalculator();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someTestMethod());
        
    }
}
