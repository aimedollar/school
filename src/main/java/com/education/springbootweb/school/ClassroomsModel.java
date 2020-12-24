package com.education.springbootweb.school;

class ClassroomsModel {
	
	private int level;
	private String shift;
	private int size;
	private String classgender;
	
	
	
	
	public ClassroomsModel() {
		super();
	}
	
	public ClassroomsModel(int level, String shift, int size, String classgender) {
		super();
		this.level= level;
		this.setShift(shift);  // is the same with:  this.shift = shift;
		this.size= size;
		this.classgender= classgender;	
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getClassgender() {
		return classgender;
	}

	public void setClassgender(String classgender) {
		this.classgender = classgender;
	}

	
}

