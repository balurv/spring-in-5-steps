package com.example.springin5steps.basic;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		
//		logic for Quick Sort
		System.out.println("using quick sort!");
		return numbers;
	}
}
