package Recursion;

import static org.junit.Assert.*;

import org.junit.*;


public class RecursionTest {
    @Test
    public void testFibonacci () {
	assertEquals(0, Recursion.fibonacci(0));
	assertEquals(1, Recursion.fibonacci(1));
	assertEquals(1, Recursion.fibonacci(2));
	assertEquals(13, Recursion.fibonacci(7));
	assertEquals(34, Recursion.fibonacci(9));
    }
    @Test
    public void testTailFibonacci () {
	assertEquals(0, Recursion.tailFibonacci(0, 0, 1));
	assertEquals(1, Recursion.tailFibonacci(1, 0, 1));
	assertEquals(1, Recursion.tailFibonacci(2, 0, 1));
	assertEquals(13, Recursion.tailFibonacci(7, 0, 1));
	assertEquals(34, Recursion.tailFibonacci(9, 0, 1));
    }

    @Test
    public void testFactorial () {
	assertEquals(1, Recursion.factorial(0));
	assertEquals(1, Recursion.factorial(1));
	assertEquals(24, Recursion.factorial(4));
	assertEquals(120, Recursion.factorial(5));
	assertEquals(6, Recursion.factorial(3));
    }
    @Test
    public void testTailFactorial () {
	assertEquals(1, Recursion.tailFactorial(0, 1));
	assertEquals(1, Recursion.tailFactorial(1, 1));
	assertEquals(24, Recursion.tailFactorial(4, 1));
	assertEquals(120, Recursion.tailFactorial(5, 1));
	assertEquals(6, Recursion.tailFactorial(3, 1));
    }
}
