package com.elitech.secure.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.elitech.secure.model.Professor;
import com.elitech.secure.model.dto.ProfessorDto;
@Mapper
public interface ProfessorMapper {

    ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

    ProfessorDto professorToProfessorDto(Professor professor);
    Professor professorDtoToProfessor(ProfessorDto professorDto);
}
