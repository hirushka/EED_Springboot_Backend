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
@Table(name = "distance_range")
@EntityListeners(AuditingEntityListener.class)

public class DistanceRange {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "min_distance")
	private String minDistance;
	
	@Column(name = "acc_id")
	private int accId;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(String minDistance) {
		this.minDistance = minDistance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}
	
}
