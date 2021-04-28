package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentServices {
	List<Student> students = new ArrayList<>();
	public void createStudents() {
		students.add(new Student(1, "himabindu", 1, 11));
		students.add(new Student(2, "bindu", 2, 22));
		students.add(new Student(3, "hima",3, 33));
		students.add(new Student(4, "himani", 4, 44));
	}
	public List<Student> getStudents(){
		createStudents();
		return students;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student student=  students.stream().filter(s -> s.getId() == id ).findFirst().get();
		return student;
	}

}
