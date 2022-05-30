package co.com.firsttest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	SimpleCalculator calc;
	
	@BeforeEach
	void init() {
		calc = new SimpleCalculator();
	}
	
	@Test
	void testSum() {
		assertEquals(8, calc.sum(5, 3));
	}

	@Test
	void testSubstraction() {
		assertEquals(2, calc.substraction(4, 2));
	}

}
