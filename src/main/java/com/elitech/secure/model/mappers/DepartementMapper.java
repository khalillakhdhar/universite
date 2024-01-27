package com.elitech.secure.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.elitech.secure.model.Departement;
import com.elitech.secure.model.dto.DepartementDto;
@Mapper
public interface DepartementMapper {
	DepartementMapper INSTANCE=Mappers.getMapper(DepartementMapper.class);
	DepartementDto departementToDepartementDto(Departement departement);
	Departement departementDtoToDepartement(DepartementDto departementDto);
}
