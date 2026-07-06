package com.venkat;

public class Fibonacci {
	public static void main(String[] args) {
		int n=10;
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm;
		for (int i=1; i<=n; i++) {
			System.out.print(firstTerm + " ");
			
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
