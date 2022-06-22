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
@Table(name = "accident_types")
@EntityListeners(AuditingEntityListener.class)

public class AccidentTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "acc_name")
	private String accName;
	
	@Column(name = "acc_description")
	private String accDescription;
	
	@Column(name = "tc_id")
	private int tcId;
	
	@Column(name = "lv_id")
	private int lvId;
	
	@Column(name = "lc_id")
	private int lcId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccDescription() {
		return accDescription;
	}

	public void setAccDescription(String accDescription) {
		this.accDescription = accDescription;
	}

	public int getTcId() {
		return tcId;
	}

	public void setTcId(int tcId) {
		this.tcId = tcId;
	}

	public int getLvId() {
		return lvId;
	}

	public void setLvId(int lvId) {
		this.lvId = lvId;
	}

	public int getLcId() {
		return lcId;
	}

	public void setLcId(int lcId) {
		this.lcId = lcId;
	}

	
}
