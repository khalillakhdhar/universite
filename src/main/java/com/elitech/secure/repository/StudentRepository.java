package com.elitech.secure.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.secure.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByNom(String nom);
	Optional<Student> findByEmail(String email);

}
