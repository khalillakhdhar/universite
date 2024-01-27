package com.elitech.secure.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Departement extends AuditModel implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nom;
private double budget;
@OneToMany(mappedBy = "departement")
@JsonIgnoreProperties(value = "departement")
private Set<Professor> professors=new HashSet<Professor>();
}
