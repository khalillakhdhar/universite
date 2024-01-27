package com.elitech.secure.model.dto;

import java.util.HashSet;
import java.util.Set;

import com.elitech.secure.model.Professor;
import com.elitech.secure.model.Student;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursDto {
	private long id;
	@NotBlank
	private String nom;
	@Positive
	private int credit;
	private Professor professor;
	
	private Set<Student> students=new HashSet<Student>();
}
