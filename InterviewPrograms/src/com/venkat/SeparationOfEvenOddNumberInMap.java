package com.venkat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class SeparationOfEvenOddNumberInMap {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

		Map<Boolean, List<Integer>> oddOrEvenNumbers = numbers.stream()
				.collect(Collectors.partitioningBy(n->n%2 ==0));
		
		System.out.println("Even Numbers List is " + oddOrEvenNumbers.get(true));
		System.out.println("Odd Numbers List is " + oddOrEvenNumbers.get(false));
		
		List<Integer> oddNumbers = new ArrayList<>();
		List<Integer> evenNumbers = new ArrayList<>();
		
		numbers.stream()
		.forEach(n->{
			if (n%2 == 0) {
				evenNumbers.add(n);
			} else {
				oddNumbers.add(n);
			}
		});

		System.out.println("Even Numbers List is " + evenNumbers);
		System.out.println("Odd Numbers List is " + oddNumbers);


	}
}
