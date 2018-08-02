package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test
		void testSum() {
			int result, expResult=10;
			Arithmetic arithmetic = new Arithmetic();
			result = arithmetic.sum(2, 8);
			assertEquals(expResult, result);
			
			
		}

		@Test
		void testMultiply() {
			int result, expResult=16;
			Arithmetic arithmetic = new Arithmetic();
			result = arithmetic.multiply(2, 8);
			assertEquals(expResult, result);
			
	}


}
