package com.company.varnaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.varnaa.controller.prescription;
import com.company.varnaa.repository.prescriptionRepository;

@Service
@Transactional
public class prescriptionService {
	
	@Autowired
	private prescriptionRepository repository;
	
	public void save(prescription Prescription) {
		repository.save(Prescription);
	}
	
	public List<prescription> findByPatientName(String patientName){
		
			return repository.findByPatientName(patientName);
	}
}
