package jUnitTestingPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions unit = new JUnitFunctions();
		int result = unit.addNumbers(5, 6);
		assertEquals(11, result);
	}

}
