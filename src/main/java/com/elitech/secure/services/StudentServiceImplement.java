package com.elitech.secure.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.elitech.secure.model.Student;
import com.elitech.secure.model.dto.StudentDto;
import com.elitech.secure.model.mappers.StudentMapper;
import com.elitech.secure.repository.StudentRepository;

public class StudentServiceImplement implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public StudentDto addOneStudent(Student student) {
		// TODO Auto-generated method stub
		
		return StudentMapper.INSTANCE.studentToStudentDto(studentRepository.save(student));
	}

	@Override
	public List<StudentDto> getAllStudents() {
		// TODO Auto-generated method stub
		List<StudentDto> students=new ArrayList<StudentDto>();
		studentRepository.findAll().forEach(st->{
			students.add(StudentMapper.INSTANCE.studentToStudentDto(st));
		});
		return students;
		
	}

	@Override
	public Optional<StudentDto> findOneStudent(long id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(StudentMapper.INSTANCE.studentToStudentDto(studentRepository.findById(id).get()));
	}

	@Override
	public Optional<StudentDto> findStudentWithEmail(String email) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(StudentMapper.INSTANCE.studentToStudentDto(studentRepository.findByEmail(email).get()));	}

	@Override
	public List<StudentDto> findOneWithName(String name) {
		// TODO Auto-generated method stub
		List<StudentDto> students=new ArrayList<StudentDto>();
		studentRepository.findByNom(name).forEach(st->
		{
			students.add(StudentMapper.INSTANCE.studentToStudentDto(st));
		}
				);
		return students;
		
		
			}


	@Override
	public void DeleteOneStudent(long id) {
		// TODO Auto-generated method stub

	}

}
