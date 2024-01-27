package com.elitech.secure.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.elitech.secure.model.StudentProfile;
import com.elitech.secure.model.dto.StudentProfileDto;

@Mapper
public interface StudentProfileMapper {
	StudentProfileMapper INSTANCE=Mappers.getMapper(StudentProfileMapper.class);
	StudentProfileDto studentProfileToStudentProfileDto(StudentProfile studentProfile);
	StudentProfile studentProfileDtoToStudentProfile(StudentProfileDto studentProfileDto);
}
