package Recursion;

/**
 * Recursion is an algorithmic technique which is based on a function calling itself in its own body. 
 * It is widely used in order to increase algorithmic efficiency and simplify the logic. Use cases of recursion can vary heavily, it can be considered as special 
 * iteration case or special algorithmic decomposition case.
 *
 * Recursive function have two main parts: base case and recursive case. Base case is basically a stop-sign for a recursive function and it is
 * binded to certain conditions. Recursive case is part of function body where the function calls itself. Each recursive call must return something. Recursive calls
 * are handled via call stack [1]. Tail recursion is special case of recursion when a function does not perform an arithmetic operation on the last 
 * line of the recursive case, but calls another function ending the recursive case with a recursion (it is where its name comes from :D). Also, there are direct and
 * indirect recursion. Direct recursion happens when a function calls itself, indirect recursion happens when two function call each other.
 *
 * References:
 * 	[1] learn1.open.ac.uk/mod/oublog/viewpost.php?post=162710
 * 	[2] https://www.baeldung.com/cs/recursion-direct-vs-indirect
 */

public class Recursion {
	public static int factorial(int n) {
		if (n == 0 || n == 1) return 1;
		return n * factorial(n-1);
	}
	public static int tailFactorial(int n, int result) {
		if (n == 1 || n == 0) return result;
		return tailFactorial(n-1, result*n);
	}
	public static int fibonacci (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static int tailFibonacci (int n, int m, int k) {
		if (n == 0) return m;
		if (n==1) return k;
		return tailFibonacci(n-1, k, m+k);
	}
}
