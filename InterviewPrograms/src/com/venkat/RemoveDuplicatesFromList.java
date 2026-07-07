package com.venkat;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,1,2,3,4,5,6);
		
		List<Integer> listWithoutDuplicates = numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Given Numbers : " + numbers );
		System.out.println("Numbers without duplicates : " + listWithoutDuplicates);
		
		Set<Integer> numbersWithNoDuplicates = numbers.stream()
				.collect(Collectors.toSet());
		System.out.println("Given Numbers : " + numbers );
		System.out.println("Numbers without Order : " + numbersWithNoDuplicates);
		
		List<Integer> uniqueNumbers = numbers.stream()
				.filter(n->numbers.indexOf(n) == numbers.lastIndexOf(n))
				.collect(Collectors.toList());

		System.out.println("Given Numbers : " + numbers );
		System.out.println("Unique Numbers : " + uniqueNumbers);
		
	}

}
