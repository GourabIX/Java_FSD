package day11.junit.Tester;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestMaxFinder {
	
	@Test
	public void testMaxFind()
	{
		assertEquals(9, MaxFinder.findMax(new int[] {4, 5, 1, 9, 7}));
		assertEquals(-4, MaxFinder.findMax(new int[] {-85, -4, -45, -32, -9}));
	}
	
}
