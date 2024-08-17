package com.healthsphere.health.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthsphere.health.entity.Doctors;

public interface DoctorRepository extends JpaRepository<Doctors, Integer> {
	Doctors findByUsername(String username);
}
