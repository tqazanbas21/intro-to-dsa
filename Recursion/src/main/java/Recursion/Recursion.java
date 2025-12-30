package Recursion;


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
