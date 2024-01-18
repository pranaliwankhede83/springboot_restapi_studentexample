package com.itp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentInfo {
	
	@Override
	public List<Student> findAll()
	{
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(new Student(101,"Pranali","Wankhede",'A',2000.0f));
	students.add(new Student(102,"Dhiraj","Bole",'B',1500.0f));
	students.add(new Student(103,"Komal","Bobade",'C',3000.0f));
	students.add(new Student(104,"Neha","Dhomane",'D',3500.0f));
	students.add(new Student(105,"Tilak","Akhatkar",'E',4000.0f));

	return students;
}
}
