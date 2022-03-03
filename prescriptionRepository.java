package com.company.varnaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.varnaa.controller.prescription;

public interface prescriptionRepository extends JpaRepository<prescription,String> {

	List<prescription> findByPatientName(String patientName);
}
