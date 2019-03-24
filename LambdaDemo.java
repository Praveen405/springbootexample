package com.praveen.java8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("peter","parklin","parkavi");
		Collections.sort(names, (String a,String b) ->{
			return a.compareTo(b);
		});
		System.out.println(names);
		
		Runnable r1 = () -> {
			System.out.println("My Runnable");
		};
	}

}
