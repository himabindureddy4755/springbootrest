package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServices {
	
	@RequestMapping("students")
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"himabindu",8,89));
		students.add(new Student(2,"bindu",8,86));
		students.add(new Student(3,"bindu",8,84));
		students.add(new Student(4,"himani",8,89));
		
		
		return students;
		
	}

}
