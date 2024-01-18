package com.itp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public abstract class StudentController {
	@Autowired
	private IStudentInfo studentInfo;
	
	
	@GetMapping(value= "/student")
	public List<Student> getStudent()
	{
		List<Student> students = studentInfo.findAll();
		return students;
	}
	

}
