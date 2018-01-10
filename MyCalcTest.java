package com.junit;

import static org.junit.Assert.*;
import software_engineering_hw1.*;
import org.junit.Test;

import com.calculator.MYCalc;

public class MYCalcTest {
	@Test
	public void testAdd() {
		MYCalc calc = new MYCalc();
		assertTrue(calc.Add(4,2) == 6);
		assertTrue(calc.Add(1,-3) == -2);
	}

	@Test
	public void testSubtract() {
		MYCalc calc = new MYCalc();
		assertTrue(calc.Subtract(4,2) == 2);
		assertTrue(calc.Subtract(-2, -5) == 3);
	}

	@Test
	public void testMultiply() {
		MYCalc calc = new MYCalc();
		assertTrue(calc.Multiply(4,2) == 8);
		assertTrue(calc.Multiply(-2, -3) == 6);
	}

}
