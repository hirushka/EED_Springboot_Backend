package com.waruni96.emergency_excercise.dto;

public class CurrentActivity {

	private int srcId;
	private float doseReading;
	private float currentActivity;
	private float accSafteyDistance;
	private float initialActivity;
	private float duration;
	public int getSrcId() {
		return srcId;
	}
	public void setSrcId(int srcId) {
		this.srcId = srcId;
	}
	public float getDoseReading() {
		return doseReading;
	}
	public void setDoseReading(float doseReading) {
		this.doseReading = doseReading;
	}
	public float getCurrentActivity() {
		return currentActivity;
	}
	public void setCurrentActivity(float currentActivity) {
		this.currentActivity = currentActivity;
	}
	public float getAccSafteyDistance() {
		return accSafteyDistance;
	}
	public void setAccSafteyDistance(float accSafteyDistance) {
		this.accSafteyDistance = accSafteyDistance;
	}
	public float getInitialActivity() {
		return initialActivity;
	}
	public void setInitialActivity(float initialActivity) {
		this.initialActivity = initialActivity;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	
}
