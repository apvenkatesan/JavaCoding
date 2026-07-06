package com.venkat;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		int num = 28;
		System.out.println("The number given " + num + (isPrime(num) ? " is a prime number" : " is not a prime number"));
		
		
		int numberOfPrimeNumbers = 15;
		int count = 0;
		int startNumber = 2;
		while (count < numberOfPrimeNumbers) {
			for (int i = startNumber; i<Integer.MAX_VALUE; i++) {
				if (isPrime(i)) {
					System.out.println(i);
					count++;
					startNumber = i + 1;
					break;
				}
			}
		}
	}
	
	static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
