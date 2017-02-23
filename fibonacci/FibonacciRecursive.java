package pl.sda.fibonacci.impl;

import pl.sda.fibonacci.Fibonacci;

public class FibonacciRecursive implements Fibonacci {

	@Override
	public long getNValue(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return getNValue(n - 1) + getNValue(n - 2);
		}
	}

}
