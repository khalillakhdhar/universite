package com.elitech.secure.model.dto;

import jakarta.validation.constraints.Null;

public class StudentProfileDto {
private long id;
@Null
private String adresse,telephone,photo;
}
