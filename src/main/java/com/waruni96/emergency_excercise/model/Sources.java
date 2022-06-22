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
@Table(name = "sources")
@EntityListeners(AuditingEntityListener.class)

public class Sources {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name="src_name")
	private String srcName;
	
	@Column(name = "src_half_life")
	private float srcHalfLife;

	@Column(name= "gamma_factor")
	private float gammaFactor;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrcName() {
		return srcName;
	}

	public void setSrcName(String srcName) {
		this.srcName = srcName;
	}

	public float getSrcHalfLife() {
		return srcHalfLife;
	}

	public void setSrcHalfLife(float srcHalfLife) {
		this.srcHalfLife = srcHalfLife;
	}

	public float getGammaFactor() {
		return gammaFactor;
	}

	public void setGammaFactor(float gammaFactor) {
		this.gammaFactor = gammaFactor;
	}

}
