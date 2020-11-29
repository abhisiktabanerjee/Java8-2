package com.learn.FunctionalInterface;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		IntStream stream = str.chars();
		System.out.println(stream);
	}

}
