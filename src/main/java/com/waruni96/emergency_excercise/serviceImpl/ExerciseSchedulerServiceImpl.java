package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.ExerciseSceduler;
import com.waruni96.emergency_excercise.repo.ExerciseScedulerRepo;
import com.waruni96.emergency_excercise.service.ExerciseSchedularService;
@Service
public class ExerciseSchedulerServiceImpl implements ExerciseSchedularService{

	@Autowired
	ExerciseScedulerRepo exerciseSchedulerRepo;
	
	static final String START_DATE= " 00:00:00";
	static final String END_DATE= " 23:59:59";
	@Override
	public String SaveExerciseSchedule(ExerciseSceduler es) {
		// TODO Auto-generated method stub
		exerciseSchedulerRepo.save(es);
		return "SUCESS";
	}
	@Override
	public List<ExerciseSceduler> getDailyScheduledExcersices() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		   LocalDateTime now = LocalDateTime.now();  
		   String td = dtf.format(now);
		   String startDate = td.concat(START_DATE);
		   String endDate = td.concat(END_DATE);
		   System.out.println(startDate +"|" + endDate);
		return exerciseSchedulerRepo.findBySceduledDateBetween(startDate, endDate);
	}
	@Override
	public List<ExerciseSceduler> getExercisesByDateBetween(String start, String end) {
		String startDate = start.concat(START_DATE);
		String endDate = end.concat(END_DATE);
		System.out.println(startDate +"|" + endDate);
		return exerciseSchedulerRepo.findBySceduledDateBetween(startDate, endDate);
	}


}
