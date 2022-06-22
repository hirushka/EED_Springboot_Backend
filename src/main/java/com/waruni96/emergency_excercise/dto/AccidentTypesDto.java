package com.waruni96.emergency_excercise.dto;


public class AccidentTypesDto {

	
	private int id;
	private String accName;
	private String accDescription;
	private int tcId;
	private int lvId;
//	private int lcId;
	
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
//	public int getLcId() {
//		return lcId;
//	}
//	public void setLcId(int lcId) {
//		this.lcId = lcId;
//	}
	
	
}
