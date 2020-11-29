package com.learn.FunctionalInterface;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learn.data.*;

public class Consumer_Predicate_Tutorial {
	
	static Consumer<Student> c1 = c1-> System.out.println(c1);
	static Consumer<List<Student>> c2 = c2-> System.out.println(c2);
	static Consumer<Student> c3 = c3-> System.out.println(c3.getName());
	static Consumer<Student> c4 = c4-> System.out.println(c4.getGender());
	static Consumer<Student> c5 = c5-> System.out.println(c5.getGpa());
	static Consumer<Student> c6 = c6-> System.out.println(c6.getName()+" "+c6.getGender()+" "+c6.getGpa());
	
	static Predicate<Student> p1 = p1-> p1.getGpa()>3.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = StudentDataBase.getAllStudents();
	//	studentList.stream().forEach(c1);
		
//		c2.accept(studentList);
		
	//	studentList.stream().filter(p1).forEach(c3.andThen(c4).andThen(c5));
		studentList.stream().filter(p1).forEach(c6);
	}

}
