package com.waruni96.emergency_excercise.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.AccidentReporter;
import com.waruni96.emergency_excercise.repo.AccidentReporterRepo;
import com.waruni96.emergency_excercise.service.AccidentReportService;

@Service
public class accidentReporterServiceImpl implements AccidentReportService {

	@Autowired
	AccidentReporterRepo accidentRepo;
	
	@Override
	public String SaveAccidentReport(AccidentReporter ar) {
		accidentRepo.save(ar);
		return "SUCESS";
	}

}
