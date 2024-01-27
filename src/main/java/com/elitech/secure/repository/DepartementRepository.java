package com.elitech.secure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.secure.model.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
List<Departement> findByNom(String nom);
}
