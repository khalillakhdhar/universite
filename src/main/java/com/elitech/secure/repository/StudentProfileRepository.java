package com.elitech.secure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.secure.model.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {

}
