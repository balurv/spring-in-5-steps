package com.example.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {
	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl();
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("binarySearch = "+binarySearch);
		System.out.println("binarySearch = "+binarySearch1);
		int result = binarySearch.binarySearch(new int[] {12,3,5}, 3);
		System.out.println(result);
	}
}