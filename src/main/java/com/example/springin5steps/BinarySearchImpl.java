package com.example.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm quickSortAlgorithm;	
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;
	
	public int binarySearch(int[] arr, int number) {
		
		int[] sortedNumbers = quickSortAlgorithm.sort(arr);
		System.out.println(quickSortAlgorithm);
		
		System.out.println(bubbleSortAlgorithm);
		return -1;
	}
}
