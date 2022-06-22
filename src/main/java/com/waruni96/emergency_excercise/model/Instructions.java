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
@Table(name = "instructions")
@EntityListeners(AuditingEntityListener.class)
public class Instructions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name="instruction_title_one")
	private String instructionTitleOne;
	
	@Column(name="instruction_description_one_one")
	private String instructionDescriptionOneOne;
	
	@Column(name="instruction_description_one_two")
	private String instructionDescriptionOneTwo;
	
	@Column(name="instruction_description_one_three")
	private String instructionDescriptionOneThree;
	
	@Column(name="instruction_description_one_four")
	private String instructionDescriptionOneFour;
	
	@Column(name="instruction_description_one_five")
	private String instructionDescriptionOneFive;
	
	@Column(name="instruction_title_two")
	private String instructionTitleTwo;
	
	@Column(name="instruction_description_two_one")
	private String instructionDescriptionTwoOne;
	
	@Column(name="instruction_description_two_two")
	private String instructionDescriptionTwoTwo;
	
	@Column(name="instruction_description_two_three")
	private String instructionDescriptionTwoThree;
	
	@Column(name="instruction_description_two_four")
	private String instructionDescriptionTwoFour;
	
	@Column(name="instruction_description_two_five")
	private String instructionDescriptionTwoFive;
	
	@Column(name="instruction_title_three")
	private String instructionTitleThree;
	
	@Column(name="instruction_description_three_one")
	private String instructionDescriptionThreeOne;
	
	@Column(name="instruction_description_three_two")
	private String instructionDescriptionThreeTwo;
	
	@Column(name="instruction_description_three_three")
	private String instructionDescriptionThreeThree;
	
	@Column(name="instruction_description_three_four")
	private String instructionDescriptionThreeFour;
	
	@Column(name="instruction_description_three_five")
	private String instructionDescriptionThreeFive;

	@Column(name="acc_id")
	private int accId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructionTitleOne() {
		return instructionTitleOne;
	}

	public void setInstructionTitleOne(String instructionTitleOne) {
		this.instructionTitleOne = instructionTitleOne;
	}

	public String getInstructionDescriptionOneOne() {
		return instructionDescriptionOneOne;
	}

	public void setInstructionDescriptionOneOne(String instructionDescriptionOneOne) {
		this.instructionDescriptionOneOne = instructionDescriptionOneOne;
	}

	public String getInstructionDescriptionOneTwo() {
		return instructionDescriptionOneTwo;
	}

	public void setInstructionDescriptionOneTwo(String instructionDescriptionOneTwo) {
		this.instructionDescriptionOneTwo = instructionDescriptionOneTwo;
	}

	public String getInstructionDescriptionOneThree() {
		return instructionDescriptionOneThree;
	}

	public void setInstructionDescriptionOneThree(String instructionDescriptionOneThree) {
		this.instructionDescriptionOneThree = instructionDescriptionOneThree;
	}

	public String getInstructionDescriptionOneFour() {
		return instructionDescriptionOneFour;
	}

	public void setInstructionDescriptionOneFour(String instructionDescriptionOneFour) {
		this.instructionDescriptionOneFour = instructionDescriptionOneFour;
	}

	public String getInstructionDescriptionOneFive() {
		return instructionDescriptionOneFive;
	}

	public void setInstructionDescriptionOneFive(String instructionDescriptionOneFive) {
		this.instructionDescriptionOneFive = instructionDescriptionOneFive;
	}

	public String getInstructionTitleTwo() {
		return instructionTitleTwo;
	}

	public void setInstructionTitleTwo(String instructionTitleTwo) {
		this.instructionTitleTwo = instructionTitleTwo;
	}

	public String getInstructionDescriptionTwoOne() {
		return instructionDescriptionTwoOne;
	}

	public void setInstructionDescriptionTwoOne(String instructionDescriptionTwoOne) {
		this.instructionDescriptionTwoOne = instructionDescriptionTwoOne;
	}

	public String getInstructionDescriptionTwoTwo() {
		return instructionDescriptionTwoTwo;
	}

	public void setInstructionDescriptionTwoTwo(String instructionDescriptionTwoTwo) {
		this.instructionDescriptionTwoTwo = instructionDescriptionTwoTwo;
	}

	public String getInstructionDescriptionTwoThree() {
		return instructionDescriptionTwoThree;
	}

	public void setInstructionDescriptionTwoThree(String instructionDescriptionTwoThree) {
		this.instructionDescriptionTwoThree = instructionDescriptionTwoThree;
	}

	public String getInstructionDescriptionTwoFour() {
		return instructionDescriptionTwoFour;
	}

	public void setInstructionDescriptionTwoFour(String instructionDescriptionTwoFour) {
		this.instructionDescriptionTwoFour = instructionDescriptionTwoFour;
	}

	public String getInstructionDescriptionTwoFive() {
		return instructionDescriptionTwoFive;
	}

	public void setInstructionDescriptionTwoFive(String instructionDescriptionTwoFive) {
		this.instructionDescriptionTwoFive = instructionDescriptionTwoFive;
	}

	public String getInstructionTitleThree() {
		return instructionTitleThree;
	}

	public void setInstructionTitleThree(String instructionTitleThree) {
		this.instructionTitleThree = instructionTitleThree;
	}

	public String getInstructionDescriptionThreeOne() {
		return instructionDescriptionThreeOne;
	}

	public void setInstructionDescriptionThreeOne(String instructionDescriptionThreeOne) {
		this.instructionDescriptionThreeOne = instructionDescriptionThreeOne;
	}

	public String getInstructionDescriptionThreeTwo() {
		return instructionDescriptionThreeTwo;
	}

	public void setInstructionDescriptionThreeTwo(String instructionDescriptionThreeTwo) {
		this.instructionDescriptionThreeTwo = instructionDescriptionThreeTwo;
	}

	public String getInstructionDescriptionThreeThree() {
		return instructionDescriptionThreeThree;
	}

	public void setInstructionDescriptionThreeThree(String instructionDescriptionThreeThree) {
		this.instructionDescriptionThreeThree = instructionDescriptionThreeThree;
	}

	public String getInstructionDescriptionThreeFour() {
		return instructionDescriptionThreeFour;
	}

	public void setInstructionDescriptionThreeFour(String instructionDescriptionThreeFour) {
		this.instructionDescriptionThreeFour = instructionDescriptionThreeFour;
	}

	public String getInstructionDescriptionThreeFive() {
		return instructionDescriptionThreeFive;
	}

	public void setInstructionDescriptionThreeFive(String instructionDescriptionThreeFive) {
		this.instructionDescriptionThreeFive = instructionDescriptionThreeFive;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	
	
	
}
