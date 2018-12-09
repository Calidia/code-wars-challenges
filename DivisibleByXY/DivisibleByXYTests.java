import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class DivisibleByXYTests {

	@Test
	public void test1() {
		assertEquals(true, DivisibleByXY.isDivisible(12,4,3));
	}
	@Test
	public void test2() {
		assertEquals(false, DivisibleByXY.isDivisible(3,3,4));
	}	
		
}