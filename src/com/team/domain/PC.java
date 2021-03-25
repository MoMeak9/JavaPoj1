package com.team.domain;

public class PC implements Equipment{
	
	private String modelString;
	private String displayString;
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public PC(String modelString, String displayString) {
		super();
		this.modelString = modelString;
		this.displayString = displayString;
	}

	public String getModelString() {
		return modelString;
	}

	public void setModelString(String modelString) {
		this.modelString = modelString;
	}

	public String getDisplayString() {
		return displayString;
	}

	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}
	
	
}
