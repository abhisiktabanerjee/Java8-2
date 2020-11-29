package com.learn.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.learn.data.Student;
import com.learn.data.StudentDataBase;

public class Bi_Consumer_Predicate {
	
	static BiPredicate<Double, String> bp1 = (b1, b2) -> b1>3.5 && b2.startsWith("J");
	static BiConsumer<String, Double> bc1 = (b1, b2) -> System.out.println(b1 + " " +b2);
	static Consumer<Double> c1 = c1-> System.out.println(c1*2);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentlist = StudentDataBase.getAllStudents();
		studentlist.stream().filter(student -> bp1.test(student.getGpa(), student.getName()))
				.forEach(d-> bc1.accept(d.getName(), d.getGpa()));
		
		studentlist.stream().forEach(data -> c1.accept(data.getGpa()));
	}

}
