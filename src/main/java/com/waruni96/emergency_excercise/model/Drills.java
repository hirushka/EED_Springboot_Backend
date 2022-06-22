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
@Table(name = "exercise_type")
@EntityListeners(AuditingEntityListener.class)
public class Drills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "drill_name")
	private String drillName;
	
	@Column(name = "drill_purpose")
	private String drillPurpose;
	
	@Column(name = "drill_purpose_des")
	private String drillPurposeDes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrillName() {
		return drillName;
	}

	public void setDrillName(String drillName) {
		this.drillName = drillName;
	}

	public String getDrillPurpose() {
		return drillPurpose;
	}

	public void setDrillPurpose(String drillPurpose) {
		this.drillPurpose = drillPurpose;
	}

	public String getDrillPurposeDes() {
		return drillPurposeDes;
	}

	public void setDrillPurposeDes(String drillPurposeDes) {
		this.drillPurposeDes = drillPurposeDes;
	}


}
