package com.htc.hospitalaggregate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.htc.hospitalaggregate.entity.Doctor;
import com.htc.hospitalaggregate.entity.Patient;
import com.htc.hospitalaggregate.externalservices.HospitalServices;

@RestController
public class HospitalServiceController {

	@Autowired
	HospitalServices hospitalServices;
	

	private static final Logger logger=LoggerFactory.getLogger(HospitalServiceController.class);
	
	@GetMapping("/hospital_service/patients/{patientId}")
	Patient getDoctor(@PathVariable Long patientId){
		logger.toString();
		return hospitalServices.getPatientById(patientId);
		
	}
	
	
}
