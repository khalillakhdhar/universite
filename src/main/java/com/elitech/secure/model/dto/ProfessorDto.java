package com.elitech.secure.model.dto;

import com.elitech.secure.model.Departement;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorDto {
	private long id;
	@NotBlank
	private String nom,specialite;
	@NotBlank
	private Departement departement;


}
