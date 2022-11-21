package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions unit = new JUnitFunctions();
		String result = unit.addStrings("hello", "World");
		assertEquals("helloWorld", result);
	}

}
