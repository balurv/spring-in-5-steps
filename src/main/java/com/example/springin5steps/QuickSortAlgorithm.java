package com.example.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		
//		logic for Quick Sort
		System.out.println("using quick sort!");
		return numbers;
	}
}
