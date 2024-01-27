package com.elitech.secure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.secure.model.Cours;

public interface CoursRepository  extends JpaRepository<Cours, Long> {
List<Cours> findByNom(String nom);

}
