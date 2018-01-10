import static org.junit.Assert.*;
import org.junit.Test;

public class MyCalcTest {
	@Test
	public void testAdd() {
		MyCalc calc = new MyCalc();
		assertTrue(calc.Add(4,2) == 6);
		assertTrue(calc.Add(1,-3) == -2);
	}

	@Test
	public void testSubtract() {
		MyCalc calc = new MyCalc();
		assertTrue(calc.Subtract(4,2) == 2);
		assertTrue(calc.Subtract(-2, -5) == 3);
	}

	@Test
	public void testMultiply() {
		MyCalc calc = new MyCalc();
		assertTrue(calc.Multiply(4,2) == 8);
		assertTrue(calc.Multiply(-2, -3) == 6);
	}

}
