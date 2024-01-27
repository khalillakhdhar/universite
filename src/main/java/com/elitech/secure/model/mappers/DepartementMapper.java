package com.elitech.secure.model.mappers;

import org.mapstruct.factory.Mappers;

import com.elitech.secure.model.Departement;
import com.elitech.secure.model.dto.DepartementDto;

public interface DepartementMapper {
	DepartementMapper INSTANCE=Mappers.getMapper(DepartementMapper.class);
	DepartementDto departementToDepartementDto(Departement departement);
	Departement departementDtoToDepartement(DepartementDto departementDto);
}
