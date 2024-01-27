package com.elitech.secure.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.elitech.secure.model.Cours;
import com.elitech.secure.model.dto.CoursDto;

@Mapper
public interface CoursMapper {
CoursMapper INSTANCE=Mappers.getMapper(CoursMapper.class);
CoursDto coursToCoursDto(Cours cours);
Cours coursDtoToCours(CoursDto coursDto);

}
