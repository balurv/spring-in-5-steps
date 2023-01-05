package com.example.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		
//		logic for Bubble Sort
		System.out.println("using bubble sort!");
		return numbers;
	}
}
