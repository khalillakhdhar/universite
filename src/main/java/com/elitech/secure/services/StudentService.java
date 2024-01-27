package com.elitech.secure.services;

import java.util.List;
import java.util.Optional;

import com.elitech.secure.model.Student;
import com.elitech.secure.model.dto.StudentDto;

public interface StudentService {
public StudentDto addOneStudent(Student student );
public List<StudentDto> getAllStudents();
public Optional<StudentDto> findOneStudent(long id);
public Optional<StudentDto> findStudentWithEmail(String email);
public List<StudentDto> findOneWithName(String name);
public void DeleteOneStudent(long id);

}
