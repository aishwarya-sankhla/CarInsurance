package com.training.beans;

public class Car {
	private String regno;
	private String modelName;
	public Car() {
		super();
		
	}
	public Car(String regno, String modelName) {
		super();
		this.regno = regno;
		this.modelName = modelName;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "Car [regno=" + regno + ", modelName=" + modelName + "]";
	}
	
}
