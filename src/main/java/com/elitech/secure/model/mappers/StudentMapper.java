package com.elitech.secure.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.elitech.secure.model.Student;
import com.elitech.secure.model.dto.StudentDto;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto studentToStudentDto(Student student);
    Student studentDtoToStudent(StudentDto studentDto);
}
/*
 * 
  <dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>1.4.2.Final</version>
</dependency>

 * 
 */
