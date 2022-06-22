package com.waruni96.emergency_excercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "exercise_schedule")
@EntityListeners(AuditingEntityListener.class)
public class ExerciseSceduler {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "ex_name")
	private String exName;
	
	@Column(name = "et_id")
	private int etId;
	
	@Column(name = "et_description")
	private String etDescription;
	
	@Column(name = "scenario_des")
	private String scenarioDes;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "created_by")
	private int createdBy;
		
	@Column(name = "sceduled_date")
	private String sceduledDate;
	
	@Column(name = "step_one")
	private String stepOne;
	
	@Column(name = "step_two")
	private String stepTwo;
	
	@Column(name = "step_three")
	private String stepThree;
	
	@Column(name = "step_four")
	private String stepFour;
	
	@Column(name = "stepFive")
	private String stepFive;
	
	@Column(name = "stepSix")
	private String stepSix;
	
	@Column(name = "stepSeven")
	private String stepSeven;
	
	@Column(name = "stepEight")
	private String stepEight;
	
	@Column(name = "stepNine")
	private String stepNine;
	
	@Column(name = "stepTen")
	private String stepTen;
	
	@Column(name = "stepEleven")
	private String stepEleven;
	
	@Column(name = "stepTwelve")
	private String stepTwelve;
	
	@Column(name = "stepThirteen")
	private String stepThirteen;
	
	@Column(name = "stepFourteen")
	private String stepFourteen;
	
	@Column(name = "stepFifteen")
	private String stepFifteen;
	
	@Column(name = "stepSixteen")
	private String stepSixteen;
	
	@Column(name = "stepSeventeen")
	private String stepSeventeen;
	
	@Column(name = "stepEighteen")
	private String stepEighteen;
	
	@Column(name = "stepNineteen")
	private String stepNineteen;
	
	@Column(name = "stepTwenty")
	private String stepTwenty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExName() {
		return exName;
	}

	public void setExName(String exName) {
		this.exName = exName;
	}

	public int getEtId() {
		return etId;
	}

	public void setEtId(int etId) {
		this.etId = etId;
	}

	public String getEtDescription() {
		return etDescription;
	}

	public void setEtDescription(String etDescription) {
		this.etDescription = etDescription;
	}

	public String getScenarioDes() {
		return scenarioDes;
	}

	public void setScenarioDes(String scenarioDes) {
		this.scenarioDes = scenarioDes;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getSceduledDate() {
		return sceduledDate;
	}

	public void setSceduledDate(String sceduledDate) {
		this.sceduledDate = sceduledDate;
	}

	public String getStepOne() {
		return stepOne;
	}

	public void setStepOne(String stepOne) {
		this.stepOne = stepOne;
	}

	public String getStepTwo() {
		return stepTwo;
	}

	public void setStepTwo(String stepTwo) {
		this.stepTwo = stepTwo;
	}

	public String getStepThree() {
		return stepThree;
	}

	public void setStepThree(String stepThree) {
		this.stepThree = stepThree;
	}

	public String getStepFour() {
		return stepFour;
	}

	public void setStepFour(String stepFour) {
		this.stepFour = stepFour;
	}

	public String getStepFive() {
		return stepFive;
	}

	public void setStepFive(String stepFive) {
		this.stepFive = stepFive;
	}

	public String getStepSix() {
		return stepSix;
	}

	public void setStepSix(String stepSix) {
		this.stepSix = stepSix;
	}

	public String getStepSeven() {
		return stepSeven;
	}

	public void setStepSeven(String stepSeven) {
		this.stepSeven = stepSeven;
	}

	public String getStepEight() {
		return stepEight;
	}

	public void setStepEight(String stepEight) {
		this.stepEight = stepEight;
	}

	public String getStepNine() {
		return stepNine;
	}

	public void setStepNine(String stepNine) {
		this.stepNine = stepNine;
	}

	public String getStepTen() {
		return stepTen;
	}

	public void setStepTen(String stepTen) {
		this.stepTen = stepTen;
	}

	public String getStepEleven() {
		return stepEleven;
	}

	public void setStepEleven(String stepEleven) {
		this.stepEleven = stepEleven;
	}

	public String getStepTwelve() {
		return stepTwelve;
	}

	public void setStepTwelve(String stepTwelve) {
		this.stepTwelve = stepTwelve;
	}

	public String getStepThirteen() {
		return stepThirteen;
	}

	public void setStepThirteen(String stepThirteen) {
		this.stepThirteen = stepThirteen;
	}

	public String getStepFourteen() {
		return stepFourteen;
	}

	public void setStepFourteen(String stepFourteen) {
		this.stepFourteen = stepFourteen;
	}

	public String getStepSixteen() {
		return stepSixteen;
	}

	public void setStepSixteen(String stepSixteen) {
		this.stepSixteen = stepSixteen;
	}

	public String getStepSeventeen() {
		return stepSeventeen;
	}

	public void setStepSeventeen(String stepSeventeen) {
		this.stepSeventeen = stepSeventeen;
	}

	public String getStepEighteen() {
		return stepEighteen;
	}

	public void setStepEighteen(String stepEighteen) {
		this.stepEighteen = stepEighteen;
	}

	public String getStepNineteen() {
		return stepNineteen;
	}

	public void setStepNineteen(String stepNineteen) {
		this.stepNineteen = stepNineteen;
	}

	public String getStepFifteen() {
		return stepFifteen;
	}

	public void setStepFifteen(String stepFifteen) {
		this.stepFifteen = stepFifteen;
	}

	public String getStepTwenty() {
		return stepTwenty;
	}

	public void setStepTwenty(String stepTwenty) {
		this.stepTwenty = stepTwenty;
	}
	
	

}
