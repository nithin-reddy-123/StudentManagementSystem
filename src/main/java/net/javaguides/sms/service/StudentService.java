package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	Student saveStudent(Student student);
	void deleteStudentById(Long id);
}
