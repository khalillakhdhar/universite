package com.elitech.secure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.secure.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
List<Professor> findByNom(String nom);
List<Professor> findBySpecialite(String specialite);
}
