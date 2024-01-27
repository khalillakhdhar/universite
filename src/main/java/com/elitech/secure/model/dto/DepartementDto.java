package com.elitech.secure.model.dto;

import java.util.HashSet;
import java.util.Set;

import com.elitech.secure.model.Professor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class DepartementDto {
	private long id;
	@NotBlank
	private String nom;
	@Positive
	private double budget;
	private Set<Professor> professors=new HashSet<Professor>();

}
